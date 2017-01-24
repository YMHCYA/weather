package lifesuggestion;

public class TravelIndex {
	/**
	 * ºÚΩÈ
	 */
	private String brf;
	/**
	 * œÍ«È
	 */
	private String txt;
	
	public String getBrf() {
		return brf;
	}
	public void setBrf(String brf) {
		this.brf = brf;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public TravelIndex(String brf, String txt) {
		super();
		this.brf = brf;
		this.txt = txt;
	}
	public TravelIndex() {
		super();
	}
	@Override
	public String toString() {
		return "TravelIndex [brf=" + brf + ", txt=" + txt + "]";
	}
	
}
