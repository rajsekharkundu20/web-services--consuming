package com.searchlocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlocation.entity.SearchEntity;

@Controller
public class SearchController {

	//handler method
	@RequestMapping("/show")
	public String showSearchLocationPage() {
		return "search_location";
	}
	
	@RequestMapping("/getLocation")
	public String getLocationId(@RequestParam("id") int id, ModelMap model) {
		
		LocationREST locationREST = new LocationREST();
		SearchEntity locationData = locationREST.getLocationData(id);
		model.addAttribute("locationDataShow",locationData);
		return "search_result";
	}
	
	
}
