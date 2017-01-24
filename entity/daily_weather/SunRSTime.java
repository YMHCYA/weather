package daily_weather;

public class SunRSTime {
	/**
	 * sunrise ÈÕ³ö
	 */
	private String sr;
	/**
	 * sunrise ÈÕÂä
	 */
	private String ss;
	public SunRSTime(String sr, String ss) {
		super();
		this.sr = sr;
		this.ss = ss;
	}
	public SunRSTime() {
		super();
	}
	public String getSr() {
		return sr;
	}
	public void setSr(String sr) {
		this.sr = sr;
	}
	public String getSs() {
		return ss;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}
	@Override
	public String toString() {
		return "SunRSTime [sr=" + sr + ", ss=" + ss + "]";
	}
	
}
