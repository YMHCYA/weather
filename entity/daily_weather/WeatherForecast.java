package daily_weather;

import now.WindInfo;

/**
 * 天气预报，七天
 * @author hap.zhu at 2016-8-27
 *
 */
public class WeatherForecast {
	/**
	 * 天文数值，日出日落时间
	 */
	private SunRSTime astro;
	/**
	 * 天气状况
	 */
	private DayAndNightWeather cond;
	/**
	 * 当地日期
	 */
	private String date;
	/**
	 * 湿度(%)
	 */
	private int hum;
	/**
	 * 降雨量(mm)
	 */
	private double pcpn;
	/**
	 * 降水概率
	 */
	private int pop;
	/**
	 * 气压
	 */
	private int pres;
	/**
	 * 能见度(km)
	 */
	private int vis;
	/**
	 * 温度
	 */
	private DayAndNightTemperature tmp;
	/**
	 * 风力状况
	 */
	private WindInfo wind;
	
	@Override
	public String toString() {
		return "WeatherForecast [astro=" + astro + ", cond=" + cond + ", date=" + date + ", hum=" + hum + ", pcpn="
				+ pcpn + ", pop=" + pop + ", pres=" + pres + ", vis=" + vis + ", tmp=" + tmp + ", wind=" + wind + "]";
	}
	public WeatherForecast() {
		super();
	}
	public WeatherForecast(SunRSTime astro, DayAndNightWeather cond, String date, int hum, double pcpn, int pop,
			int pres, int vis, DayAndNightTemperature tmp, WindInfo wind) {
		super();
		this.astro = astro;
		this.cond = cond;
		this.date = date;
		this.hum = hum;
		this.pcpn = pcpn;
		this.pop = pop;
		this.pres = pres;
		this.vis = vis;
		this.tmp = tmp;
		this.wind = wind;
	}
	public SunRSTime getAstro() {
		return astro;
	}
	public void setAstro(SunRSTime astro) {
		this.astro = astro;
	}
	public DayAndNightWeather getCond() {
		return cond;
	}
	public void setCond(DayAndNightWeather cond) {
		this.cond = cond;
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
	public double getPcpn() {
		return pcpn;
	}
	public void setPcpn(double pcpn) {
		this.pcpn = pcpn;
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
	public int getVis() {
		return vis;
	}
	public void setVis(int vis) {
		this.vis = vis;
	}
	public WindInfo getWind() {
		return wind;
	}
	public void setWind(WindInfo wind) {
		this.wind = wind;
	}
	public DayAndNightTemperature getTmp() {
		return tmp;
	}
	public void setTmp(DayAndNightTemperature tmp) {
		this.tmp = tmp;
	}
	
	
}
