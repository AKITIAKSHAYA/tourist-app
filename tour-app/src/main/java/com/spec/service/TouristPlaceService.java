package com.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entity.TouristPlace;
import com.spec.repo.TouristPlaceRepo;

@Service
public class TouristPlaceService {
	
	@Autowired
	TouristPlaceRepo tpRepo;

	public List<TouristPlace> createAllNewTP(List<TouristPlace> touristPlaceList) {
		// TODO Auto-generated method stub
		return tpRepo.saveAll(touristPlaceList);
	}

	/*public TouristPlace deleteAllNewTP(String name) {
		// TODO Auto-generated method stub
		return tpRepo.delete(name);
	}*/

}