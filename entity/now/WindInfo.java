package now;

public class WindInfo {
	/**
	 * 风速(Kmph)
	 */
	private int spd;
	/**
	 * 风力等级
	 */
	private String sc;
	/**
	 * 风向(角度)
	 */
	private int deg;
	/**
	 * 风向(方向)
	 */
	private String dir;
	public WindInfo(int spd, String sc, int deg, String dir) {
		super();
		this.spd = spd;
		this.sc = sc;
		this.deg = deg;
		this.dir = dir;
	}
	public WindInfo() {
		super();
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return "WindInfo [spd=" + spd + ", sc=" + sc + ", deg=" + deg + ", dir=" + dir + "]";
	}
	
}
