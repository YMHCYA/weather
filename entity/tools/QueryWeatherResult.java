package tools;

import horuly_forecast.HourlyForecast;

import java.util.List;

import lifesuggestion.LifeSuggestion;
import now.CurrentTimeWeather;
import aqi.AirQualityIndex;
import basic.CityBasicInfo;
import daily_weather.WeatherForecast;

public class QueryWeatherResult {
	private CityBasicInfo basic; //城市名称ID国家经纬度
	private AirQualityIndex aqi; //空气质量
	private LifeSuggestion suggestion; //生活建议
	private CurrentTimeWeather now; //当前天气
	private List<WeatherForecast> daily_forecast;
	private List<HourlyForecast> hourly_forecast;
	private String status;
	public QueryWeatherResult(CityBasicInfo basic, AirQualityIndex aqi, LifeSuggestion suggestion,
			CurrentTimeWeather now, List<WeatherForecast> daily_forecast, List<HourlyForecast> hourly_forecast,
			String status) {
		super();
		this.basic = basic;
		this.aqi = aqi;
		this.suggestion = suggestion;
		this.now = now;
		this.daily_forecast = daily_forecast;
		this.hourly_forecast = hourly_forecast;
		this.status = status;
	}
	public QueryWeatherResult() {
		super();
	}
	public CityBasicInfo getBasic() {
		return basic;
	}
	public void setBasic(CityBasicInfo basic) {
		this.basic = basic;
	}
	public AirQualityIndex getAqi() {
		return aqi;
	}
	public void setAqi(AirQualityIndex aqi) {
		this.aqi = aqi;
	}
	public LifeSuggestion getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(LifeSuggestion suggestion) {
		this.suggestion = suggestion;
	}
	public CurrentTimeWeather getNow() {
		return now;
	}
	public void setNow(CurrentTimeWeather now) {
		this.now = now;
	}
	public List<WeatherForecast> getDaily_forecast() {
		return daily_forecast;
	}
	public void setDaily_forecast(List<WeatherForecast> daily_forecast) {
		this.daily_forecast = daily_forecast;
	}
	public List<HourlyForecast> getHourly_forecast() {
		return hourly_forecast;
	}
	public void setHourly_forecast(List<HourlyForecast> hourly_forecast) {
		this.hourly_forecast = hourly_forecast;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "QueryWeatherResult [basic=" + basic + ", aqi=" + aqi + ", suggestion=" + suggestion + ", now=" + now
				+ ", daily_forecast=" + daily_forecast + ", hourly_forecast=" + hourly_forecast + ", status=" + status
				+ "]";
	}
	
}
