package com.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.Model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

	@Query("select e from Hotel e where e.hotelId=:hotelId")
	List<Hotel> findByHotelId(@Param("hotelId")int hotelId);

	@Query("select e from Hotel e where e.name=:name")
	List<Hotel> findByHotelName(@Param("name") String name);
	

}

