package lifesuggestion;

public class FluIndex {
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
	public FluIndex(String brf, String txt) {
		super();
		this.brf = brf;
		this.txt = txt;
	}
	public FluIndex() {
		super();
	}
	@Override
	public String toString() {
		return "FluIndex [brf=" + brf + ", txt=" + txt + "]";
	}
	
}
