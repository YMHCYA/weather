package daily_weather;

public class DayAndNightWeather {
	/**
	 * 白天天气 代码
	 */
	private int code_d;
	/**
	 * 夜晚天气 代码
	 */
	private int code_n;
	/**
	 * 白天天气 描述
	 */
	private String txt_d;
	/**
	 * 夜晚天气 描述
	 */
	private String txt_n;
	public DayAndNightWeather(int code_d, int code_n, String txt_d, String txt_n) {
		super();
		this.code_d = code_d;
		this.code_n = code_n;
		this.txt_d = txt_d;
		this.txt_n = txt_n;
	}
	public DayAndNightWeather() {
		super();
	}
	public int getCode_d() {
		return code_d;
	}
	public void setCode_d(int code_d) {
		this.code_d = code_d;
	}
	public int getCode_n() {
		return code_n;
	}
	public void setCode_n(int code_n) {
		this.code_n = code_n;
	}
	public String getTxt_d() {
		return txt_d;
	}
	public void setTxt_d(String txt_d) {
		this.txt_d = txt_d;
	}
	public String getTxt_n() {
		return txt_n;
	}
	public void setTxt_n(String txt_n) {
		this.txt_n = txt_n;
	}
	@Override
	public String toString() {
		return "DayAndNightWeather [code_d=" + code_d + ", code_n=" + code_n + ", txt_d=" + txt_d + ", txt_n=" + txt_n
				+ "]";
	}
	
}
