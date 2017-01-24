package tools;

import java.util.List;

public class QueryResultForWeatherFirst {
	List<QueryWeatherResult> HeWeatherdataservice;

	public QueryResultForWeatherFirst(List<QueryWeatherResult> heWeatherdataservice) {
		super();
		HeWeatherdataservice = heWeatherdataservice;
	}

	public QueryResultForWeatherFirst() {
		super();
	}

	public List<QueryWeatherResult> getHeWeatherdataservice() {
		return HeWeatherdataservice;
	}

	public void setHeWeatherdataservice(List<QueryWeatherResult> heWeatherdataservice) {
		HeWeatherdataservice = heWeatherdataservice;
	}

	@Override
	public String toString() {
		return "QueryResultForWeatherFirst [HeWeatherdataservice=" + HeWeatherdataservice + "]";
	}
	
}
