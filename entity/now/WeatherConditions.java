package now;

public class WeatherConditions {
	/**
	 * 天气代码，可用于下载图片
	 */
	private int code;
	/**
	 * 天气详情
	 */
	private String txt;
	public WeatherConditions(int code, String txt) {
		super();
		this.code = code;
		this.txt = txt;
	}
	public WeatherConditions() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	@Override
	public String toString() {
		return "WeatherConditions [code=" + code + ", txt=" + txt + "]";
	}
	
}
