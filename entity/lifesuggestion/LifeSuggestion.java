package lifesuggestion;

/**
 * 生活指数suggestion
 * @author hap.zhu at 2016.8.27
 *
 */
public class LifeSuggestion {
	/**
	 * 舒适度指数
	 */
	private ComfortableIndex comf;
	/**
	 * 穿衣指数
	 */
	private DressIndex drsg;
	/**
	 * 紫外线指数
	 */
	private UltravioletRayIndex uv;
	/**
	 * 洗车指数
	 */
	private	CarWashIndex cw;
	/**
	 * 旅游指数
	 */
	private TravelIndex trav;
	/**
	 * 感冒指数
	 */
	private FluIndex flu;
	/**
	 * 运动指数
	 */
	private SportIndex sport;
	public LifeSuggestion(ComfortableIndex comf, DressIndex drsg, UltravioletRayIndex uv, CarWashIndex cw,
			TravelIndex trav, FluIndex flu, SportIndex sport) {
		super();
		this.comf = comf;
		this.drsg = drsg;
		this.uv = uv;
		this.cw = cw;
		this.trav = trav;
		this.flu = flu;
		this.sport = sport;
	}
	public LifeSuggestion() {
		super();
	}
	@Override
	public String toString() {
		return "LifeSuggestion [comf=" + comf + ", drsg=" + drsg + ", uv=" + uv + ", cw=" + cw + ", trav=" + trav
				+ ", flu=" + flu + ", sport=" + sport + "]";
	}
	public ComfortableIndex getComf() {
		return comf;
	}
	public void setComf(ComfortableIndex comf) {
		this.comf = comf;
	}
	public DressIndex getDrsg() {
		return drsg;
	}
	public void setDrsg(DressIndex drsg) {
		this.drsg = drsg;
	}
	public UltravioletRayIndex getUv() {
		return uv;
	}
	public void setUv(UltravioletRayIndex uv) {
		this.uv = uv;
	}
	public CarWashIndex getCw() {
		return cw;
	}
	public void setCw(CarWashIndex cw) {
		this.cw = cw;
	}
	public TravelIndex getTrav() {
		return trav;
	}
	public void setTrav(TravelIndex trav) {
		this.trav = trav;
	}
	public FluIndex getFlu() {
		return flu;
	}
	public void setFlu(FluIndex flu) {
		this.flu = flu;
	}
	public SportIndex getSport() {
		return sport;
	}
	public void setSport(SportIndex sport) {
		this.sport = sport;
	}
	
}
