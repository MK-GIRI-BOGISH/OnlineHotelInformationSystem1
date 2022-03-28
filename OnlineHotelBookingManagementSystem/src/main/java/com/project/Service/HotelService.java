package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.City;
import com.project.Model.Hotel;
import com.project.Repository.CityRepository;
import com.project.Repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	HotelRepository repo;
	public Hotel addHotel(Hotel h) {
		return repo.save(h);
	}
	public List<Hotel> findByHotelId(int hotelId) {
		return repo.findByHotelId(hotelId);
	
	}

	public List<Hotel> findByHotelName(String name) {
		// TODO Auto-generated method stub
		return repo.findByHotelName(name);
	}
	
	@Autowired
	CityRepository repo1;
	public City addCity(City h) {
		return repo1.save(h);
	}
	
	
	

}

