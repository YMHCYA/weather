package basic;

public class WeatherUpdateTime {
	/**
	 * ���ݸ��µĵ���ʱ��
	 */
	private String loc;
	/**
	 * ���ݸ��µ�UTCʱ��
	 */
	private String utc;
	public WeatherUpdateTime() {
		super();
	}
	public WeatherUpdateTime(String loc, String utc) {
		super();
		this.loc = loc;
		this.utc = utc;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getUtc() {
		return utc;
	}
	public void setUtc(String utc) {
		this.utc = utc;
	}
	@Override
	public String toString() {
		return "WeatherUpdateTime [loc=" + loc + ", utc=" + utc + "]";
	}
	
}
