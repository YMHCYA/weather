package horuly_forecast;

import now.WindInfo;

/**
 * 当日天气预报，每隔三小时更新一次
 * @author hap.zhu at 2016.8.17
 *
 */
public class HourlyForecast {
	/**
	 * 当地日期
	 */
	private String date;
	/**
	 * 湿度(%)
	 */
	private int hum;
	/**
	 * 降水概率
	 */
	private int pop;
	/**
	 * 气压
	 */
	private int pres;
	/**
	 * 风力状况
	 */
	private WindInfo wind;
	/**
	 * 温度
	 */
	private String tmp;
	public HourlyForecast(String date, int hum, int pop, int pres, WindInfo wind, String tmp) {
		super();
		this.date = date;
		this.hum = hum;
		this.pop = pop;
		this.pres = pres;
		this.wind = wind;
		this.tmp = tmp;
	}
	public HourlyForecast() {
		super();
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public int getPres() {
		return pres;
	}
	public void setPres(int pres) {
		this.pres = pres;
	}
	public WindInfo getWind() {
		return wind;
	}
	public void setWind(WindInfo wind) {
		this.wind = wind;
	}
	public String getTmp() {
		return tmp;
	}
	public void setTmp(String tmp) {
		this.tmp = tmp;
	}
	@Override
	public String toString() {
		return "HourlyForecast [date=" + date + ", hum=" + hum + ", pop=" + pop + ", pres=" + pres + ", wind=" + wind
				+ ", tmp=" + tmp + "]";
	}
	
}
