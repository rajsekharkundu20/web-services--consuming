package com.searchlocation.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlocation.entity.SearchEntity;

public class LocationREST {
	
	public SearchEntity getLocationData(int id) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		SearchEntity searchEntity = restTemplate.getForObject("http://localhost:8080/location/api/get/"+id, SearchEntity.class);
	return searchEntity;
	
	}

}
