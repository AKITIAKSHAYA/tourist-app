package com.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spec.entity.TouristPlace;
import com.spec.service.TouristPlaceService;

@RestController
public class TouristPlaceController {
	@Autowired
	TouristPlaceService tpService;

	@PostMapping("/tp/add")
	public List<TouristPlace> createNewTouristPlace(@RequestBody List<TouristPlace> touristPlaceList) {
		return tpService.createAllNewTP(touristPlaceList);
	}
	
	/*@DeleteMapping("/td/delete/{name}")
	 public TouristPlace deleteTouristPlaceByName(@PathVariable String name) {
		return tpService.deleteAllNewTP(name);
    }*/
	
}
