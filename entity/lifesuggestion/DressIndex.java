package lifesuggestion;

public class DressIndex {
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
	public DressIndex(String brf, String txt) {
		super();
		this.brf = brf;
		this.txt = txt;
	}
	public DressIndex() {
		super();
	}
	@Override
	public String toString() {
		return "DressIndex [brf=" + brf + ", txt=" + txt + "]";
	}
	
}
