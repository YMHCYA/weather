package aqi;
/**
 * 绌烘皵璐ㄩ噺鎸囨暟璇︽儏
 * @author hap.zhu at 2016-8-27
 *
 */
public class AQICity {
	/**
	 * 绌烘皵璐ㄩ噺鎸囨暟
	 */
	private int aqi;
	/**
	 * 涓�哀鍖栫⒊1灏忔椂骞冲潎鍊�ug/m鲁)
	 */
	private int co;
	/**
	 *浜屾哀鍖栨爱1灏忔椂骞冲潎鍊�ug/m鲁)
	 */
	private int no2;
	/**
	 * 鑷哀1灏忔椂骞冲潎鍊�ug/m鲁)
	 */
	private int o3;
	/**
	 *  PM10 1灏忔椂骞冲潎鍊�ug/m鲁)
	 */
	private int pm10;
	/**
	 * PM2.5 1灏忔椂骞冲潎鍊�ug/m鲁)
	 */
	private int pm25;
	/**
	 * 绌烘皵璐ㄩ噺绫诲埆
	 */
	private String qlty;
	/**
	 * 浜屾哀鍖栫～1灏忔椂骞冲潎鍊�ug/m鲁)
	 */
	private int so2;
	public AQICity() {
		super();
	}
	public AQICity(int aqi, int co, int no2, int o3, int pm10, int pm25, String qlty, int so2) {
		super();
		this.aqi = aqi;
		this.co = co;
		this.no2 = no2;
		this.o3 = o3;
		this.pm10 = pm10;
		this.pm25 = pm25;
		this.qlty = qlty;
		this.so2 = so2;
	}
	public int getAqi() {
		return aqi;
	}
	public void setAqi(int aqi) {
		this.aqi = aqi;
	}
	public int getCo() {
		return co;
	}
	public void setCo(int co) {
		this.co = co;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public int getO3() {
		return o3;
	}
	public void setO3(int o3) {
		this.o3 = o3;
	}
	public int getPm10() {
		return pm10;
	}
	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}
	public int getPm25() {
		return pm25;
	}
	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}
	public String getQlty() {
		return qlty;
	}
	public void setQlty(String qlty) {
		this.qlty = qlty;
	}
	public int getSo2() {
		return so2;
	}
	public void setSo2(int so2) {
		this.so2 = so2;
	}
	@Override
	public String toString() {
		return "AQICity [aqi=" + aqi + ", co=" + co + ", no2=" + no2 + ", o3=" + o3 + ", pm10=" + pm10 + ", pm25="
				+ pm25 + ", qlty=" + qlty + ", so2=" + so2 + "]";
	}
	
	
}
