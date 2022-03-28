package com.project.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="CITY_MASTER")
public class City {

@Id
@Column(name="CITY_ID")
private int id;

@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy ="city")
@JsonBackReference
private Hotel hotel;

@Column(name="CITY_NAME")
private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
