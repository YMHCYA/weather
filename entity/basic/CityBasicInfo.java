package basic;
/**
 * 城市基本信息
 * @author hap.zhu at 2016.8.27
 *
 */
public class CityBasicInfo {
	/**
	 * 城市名称
	 */
	private String city;
	/**
	 * 城市ID
	 */
	private String cnty;
	/**
	 * 国家名称
	 */
	private String id;
	/**
	 * 纬度
	 */
	private double lat;
	/**
	 * 经度
	 */
	private double lon;
	/**
	 * 数据更新时间，24小时制
	 */
	private WeatherUpdateTime update;
	public CityBasicInfo(String city, String cnty, String id, double lat, double lon, WeatherUpdateTime update) {
		super();
		this.city = city;
		this.cnty = cnty;
		this.id = id;
		this.lat = lat;
		this.lon = lon;
		this.update = update;
	}
	public CityBasicInfo() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCnty() {
		return cnty;
	}
	public void setCnty(String cnty) {
		this.cnty = cnty;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public WeatherUpdateTime getUpdate() {
		return update;
	}
	public void setUpdate(WeatherUpdateTime update) {
		this.update = update;
	}
	@Override
	public String toString() {
		return "CityBasicInfo [city=" + city + ", cnty=" + cnty + ", id=" + id + ", lat=" + lat + ", lon=" + lon
				+ ", update=" + update + "]";
	}
	
	
}
