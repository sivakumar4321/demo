package com.bank.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.master.service.LoadCityRoads;

@RestController
public class CityConnect {
	public static final String YES = "YES , CITIES  ARE  CONNECTED";
	public static final String NO = "NO , CITIES  ARE  NOT CONNECTED";
	@Autowired
	LoadCityRoads roadService;

	@GetMapping("/connected")
	public String getCityConnected(@RequestParam String origin,@RequestParam String destination) {
		
		boolean result = roadService.isCitiesConnected(origin,destination);
		if(result) {
			return YES + ":\t\t " + origin.toUpperCase() + ",\t\t "+ destination.toUpperCase();
		}
		else {
			return NO + ":\t\t " + origin.toUpperCase() + ",\t\t "+ destination.toUpperCase();
		}
		
	}

}
