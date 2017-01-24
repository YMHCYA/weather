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
			tvTemp.setText(bundle.getString("temperature") + "��");
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
					// [2] ��ȡһ��URL����
					// URL url = new URL("http://" + strUrl);
					URL url = new URL(
							"https://api.heweather.com/x3/weather?cityid=CN101240103&key=7f4799b1e90f4abb800ab9e144ef8aa9");
					// [3] ��ȡhttpurlconnection����
					HttpURLConnection urlConnection = (HttpURLConnection) url
							.openConnection();
					// [4] ��������ʽ��Ĭ������ʽ��GET��GETҪ���д
					urlConnection.setRequestMethod("GET");
					// [5] ������Ӧʱ�伴����ʱ��
					urlConnection.setReadTimeout(5000);
					// System.out.println("����ʱ��");
					// [6] ��ȡ�����룬���Ƿ���Ӧ�ɹ�

					int code = urlConnection.getResponseCode();
					// System.out.println("������: " + code);
					// [7] ������������200�����ɹ�����
					if (code == 200) {
						// System.out.println("�ɹ�������վ");
						// [8] ��ȡ���ļ�
						InputStream in = new BufferedInputStream(
								urlConnection.getInputStream());
						// [9] ��ʼ�������н���
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
						// �����ַ�����ɾȥ�����ո���3.0
						sb.deleteCharAt(11);
						sb.deleteCharAt(15);
						sb.delete(22, 26);
						String result = sb.toString();
						// Log.d(TAG, "success status=" + ",responseString="
						// + result);
						// ����GSON���߽���
						Gson gson = new Gson();
						QueryResultForWeatherFirst weatherResult = gson
								.fromJson(result,
										QueryResultForWeatherFirst.class);
						// CityBasicInfo city = weatherResult.
						// Log.d(TAG, "weatherResult=" + weatherResult);
						// ��ȡ���У�����ͼƬ���¶ȣ�����
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
			// [1] ��ȡurl
			URL url = new URL(path);
			// [2] ͨ��open..��ȡconn
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// [3] ���÷���url����
			conn.setRequestMethod("GET");
			// [4] ���ó�ʱʱ�䣬5S
			conn.setReadTimeout(5000);
			// [5] ��ȡ���ʷ��ص���
			int code = conn.getResponseCode();

			// ��6�� ������������200�����ӳɹ�
			if (code == 200) {
				System.out.println("�ɹ�������վ");
				// [7] �ж��Ƿ���ڻ�������
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
