package com.example.weather;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import tools.QueryResultForWeatherFirst;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends ActionBarActivity {
	private String city;
	private String condition;
	private String conditionImg;
	private String temperature;
	private TextView tvCity;
	private TextView tvCond;
	private TextView tvTemp;
	private ImageView ivCondimg;

	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			Bundle bundle = msg.getData();
			tvCity.setText(bundle.getString("city"));
			tvCond.setText(bundle.getString("condition"));
			tvTemp.setText(bundle.getString("temperature") + "℃");
			ivCondimg.setImageBitmap((Bitmap) bundle.getParcelable("bitmap"));

		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
		initDate();
	}

	public void initView() {
		tvCity = (TextView) this.findViewById(R.id.tv_city);
		tvCond = (TextView) this.findViewById(R.id.tv_cond);
		tvTemp = (TextView) this.findViewById(R.id.tv_temp);
		ivCondimg = (ImageView) this.findViewById(R.id.iv_condimg);
	}

	public void initDate() {
		// Log.d(TAG, "aaa");
		// System.out.println("111");
		new Thread() {

			public void run() {
				// String strUrl = ed.getText().toString().trim();

				try {
					// [2] 获取一个URL对象
					// URL url = new URL("http://" + strUrl);
					URL url = new URL(
							"https://api.heweather.com/x3/weather?cityid=CN101240103&key=7f4799b1e90f4abb800ab9e144ef8aa9");
					// [3] 获取httpurlconnection对象
					HttpURLConnection urlConnection = (HttpURLConnection) url
							.openConnection();
					// [4] 设置请求方式，默认请求方式是GET，GET要求大写
					urlConnection.setRequestMethod("GET");
					// [5] 设置相应时间即请求时间
					urlConnection.setReadTimeout(5000);
					// System.out.println("请求时间");
					// [6] 获取返回码，看是否相应成功

					int code = urlConnection.getResponseCode();
					// System.out.println("返回码: " + code);
					// [7] 如果返回码等于200，即成功连接
					if (code == 200) {
						// System.out.println("成功连接网站");
						// [8] 获取流文件
						InputStream in = new BufferedInputStream(
								urlConnection.getInputStream());
						// [9] 开始对流进行解析
						int len = -1;
						byte[] buffer = new byte[1024];
						ByteArrayOutputStream bo = new ByteArrayOutputStream();
						while ((len = in.read(buffer)) != -1) {
							bo.write(buffer, 0, len);
						}
						String strurl = bo.toString();
						in.close();
						// System.out.println(strurl.toString());

						StringBuilder sb = new StringBuilder(strurl);
						// 处理字符串，删去两个空格与3.0
						sb.deleteCharAt(11);
						sb.deleteCharAt(15);
						sb.delete(22, 26);
						String result = sb.toString();
						// Log.d(TAG, "success status=" + ",responseString="
						// + result);
						// 利用GSON工具解析
						Gson gson = new Gson();
						QueryResultForWeatherFirst weatherResult = gson
								.fromJson(result,
										QueryResultForWeatherFirst.class);
						// CityBasicInfo city = weatherResult.
						// Log.d(TAG, "weatherResult=" + weatherResult);
						// 获取城市，天气图片，温度，天气
						// private String city;
						// private String condition;
						// private String conditionImg;
						// private String temperature;
						city = weatherResult.getHeWeatherdataservice().get(0)
								.getBasic().getCity();
						condition = weatherResult.getHeWeatherdataservice()
								.get(0).getNow().getCond().getTxt();
						int wcode = weatherResult.getHeWeatherdataservice()
								.get(0).getNow().getCond().getCode();
						conditionImg = "http://files.heweather.com/cond_icon/"
								+ wcode + ".png";
						temperature = weatherResult.getHeWeatherdataservice()
								.get(0).getNow().getFl()
								+ "";

						Bitmap bitmap = loadImg(conditionImg, wcode);
						Bundle bundle = new Bundle();
						bundle.putString("city", city);
						bundle.putString("condition", condition);

						bundle.putParcelable("bitmap", bitmap);
						bundle.putString("temperature", temperature);

						Message msg = Message.obtain();
						msg.setData(bundle);
						handler.sendMessage(msg);
						// System.out.println(weatherResult
						// .getHeWeatherdataservice().get(0).getBasic()
						// .getCity());
						// System.out.println(weatherResult
						// .getHeWeatherdataservice().get(0).getNow()
						// .getCond().getCode());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}

	public Bitmap loadImg(String path, int wcode) {
		System.out.println(path);
		try {
			// [1] 获取url
			URL url = new URL(path);
			// [2] 通过open..获取conn
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// [3] 设置访问url类型
			conn.setRequestMethod("GET");
			// [4] 设置超时时间，5S
			conn.setReadTimeout(5000);
			// [5] 获取访问返回的码
			int code = conn.getResponseCode();

			// 【6】 如果返回码等于200，连接成功
			if (code == 200) {
				System.out.println("成功连接网站");
				// [7] 判断是否存在缓存数据
				File file = new File(getCacheDir(), "w" + wcode + ".png");
				if (file.exists() && file.length() > 0) {
					Bitmap bitmap = BitmapFactory.decodeFile(file
							.getAbsolutePath());
					return bitmap;
				} else {
					InputStream in = new BufferedInputStream(
							conn.getInputStream());
					OutputStream fos = new FileOutputStream(
							file.getAbsoluteFile());

					int len = -1;
					byte[] buffer = new byte[1024];
					while ((len = in.read(buffer)) != -1) {
						fos.write(buffer, 0, len);
					}
					in.close();
					fos.close();
					Bitmap bitmap = BitmapFactory.decodeFile(file
							.getAbsolutePath());

					return bitmap;
				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
