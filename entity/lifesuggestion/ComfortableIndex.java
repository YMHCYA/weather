package lifesuggestion;

public class ComfortableIndex {
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
	public ComfortableIndex(String brf, String txt) {
		super();
		this.brf = brf;
		this.txt = txt;
	}
	public ComfortableIndex() {
		super();
	}
	@Override
	public String toString() {
		return "ComfortableIndex [brf=" + brf + ", txt=" + txt + "]";
	}
	
}
