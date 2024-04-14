package com.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spec.entity.TouristPlace;

public interface TouristPlaceRepo extends JpaRepository<TouristPlace,String>{

	/*TouristPlace delete(String name);*/

}
