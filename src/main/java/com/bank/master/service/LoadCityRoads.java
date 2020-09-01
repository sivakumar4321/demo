package com.bank.master.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class LoadCityRoads {
	
	private HashMap<String, List<String>> cityRoadMap = new HashMap<String, List<String>>();


	public LoadCityRoads() {
		init();
	}
	
	public void init() {
		
		/*Load following City Road Map
		 * Boston,NewYork
		 * Philadelphia,Newark
		 * Newark,Boston
		 * Trenton,Albany
		 */
		String city = "Boston";
		ArrayList<String> roadConnetedToCity = new ArrayList<String>();
		roadConnetedToCity.add("NewYork");
		roadConnetedToCity.add("Newark");
		cityRoadMap.put(city, roadConnetedToCity);
		
		city = "NewYork";
		roadConnetedToCity = new ArrayList<String>();
		roadConnetedToCity.add("Boston");
		cityRoadMap.put(city, roadConnetedToCity);
		
		city = "Philadelphia";
		roadConnetedToCity = new ArrayList<String>();
		roadConnetedToCity.add("Newark");
		cityRoadMap.put(city, roadConnetedToCity);
		

		city = "Newark";
		roadConnetedToCity = new ArrayList<String>();
		roadConnetedToCity.add("Boston");
		roadConnetedToCity.add("Philadelphia");
		cityRoadMap.put(city, roadConnetedToCity);
		
		city = "Trenton";
		roadConnetedToCity = new ArrayList<String>();
		roadConnetedToCity.add("Albany");
		cityRoadMap.put(city, roadConnetedToCity);
		
		city = "Albany";
		roadConnetedToCity = new ArrayList<String>();
		roadConnetedToCity.add("Trenton");
		cityRoadMap.put(city, roadConnetedToCity);
		
		
			
	}
	
	public boolean isCitiesConnected(String origin,String destination) {
		if(cityRoadMap == null || cityRoadMap.size() == 0 ) {
			return false;
		}
		
		List<String> roadListOrigin = cityRoadMap.get(origin);
		List<String> roadListDestination = cityRoadMap.get(destination);
		
		if(roadListOrigin == null || roadListOrigin.size() == 0 ) {
			return false;
		}
		
		if(roadListDestination == null || roadListDestination.size() == 0 ) {
			return false;
		}
		
		Stream<String> resultO = roadListOrigin.stream().filter(p ->p.equals(destination));
		Stream<String> resultD = roadListDestination.stream().filter(p ->p.equals(origin));

		if((resultO != null && resultO.count() > 0) || resultD != null && resultD.count() > 0  ) {
			return true;
			
		}else {
			return false;	
		}
		
	}
	 
}
