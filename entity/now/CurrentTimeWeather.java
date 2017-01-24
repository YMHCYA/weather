package now;

/**
 * 实况天气
 * @author hap.zhu at 2016-8-27
 *
 */
public class CurrentTimeWeather {
	/**
	 * 天气状况
	 */
	private WeatherConditions cond;
	/**
	 * 风力状况
	 */
	private WindInfo wind;
	/**
	 * 体感温度
	 */
	private int fl;
	
	/**
	 * 降雨量(mm)
	 */
	private double pcpn;
	/**
	 * 湿度(%)
	 */
	private int hum;
	/**
	 * 气压
	 */
	private int pres;
	/**
	 * 能见度(km)
	 */
	private int vis;
	public CurrentTimeWeather(WeatherConditions cond, WindInfo wind, int fl, int pcpn, int hum, int pres, int vis) {
		super();
		this.cond = cond;
		this.wind = wind;
		this.fl = fl;
		this.pcpn = pcpn;
		this.hum = hum;
		this.pres = pres;
		this.vis = vis;
	}
	public CurrentTimeWeather() {
		super();
	}
	public WeatherConditions getCond() {
		return cond;
	}
	public void setCond(WeatherConditions cond) {
		this.cond = cond;
	}
	public WindInfo getWind() {
		return wind;
	}
	public void setWind(WindInfo wind) {
		this.wind = wind;
	}
	public int getFl() {
		return fl;
	}
	public void setFl(int fl) {
		this.fl = fl;
	}
	public double getPcpn() {
		return pcpn;
	}
	public void setPcpn(double pcpn) {
		this.pcpn = pcpn;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
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
	@Override
	public String toString() {
		return "CurrentTimeWeather [cond=" + cond + ", wind=" + wind + ", fl=" + fl + ", pcpn=" + pcpn + ", hum=" + hum
				+ ", pres=" + pres + ", vis=" + vis + "]";
	}
	
	
}
