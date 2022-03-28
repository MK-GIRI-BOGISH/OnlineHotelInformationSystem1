package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Model.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
