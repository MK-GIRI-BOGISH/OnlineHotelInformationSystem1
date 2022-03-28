package com.project.Model;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="HOTEL_LIST")
public class Hotel {
	
    @Id
    @Column(name="HOTEL_ID")
	private int hotelId;
   
    @Column(name="HOTEL_NAME")
	private String name;
    
    @Column(name="HOTEL_CONTACT_NO")
	private BigInteger contactNo;
    
    @Column(name="HOTEL_ADDRESS")
	private String address;
	
	@Column(name="TYPE_OF_HOTEL")
	private String type;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CITY_ID")
	@JsonBackReference
	private City city;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getContactNo() {
		return contactNo;
	}

	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Hotel(int hotelId) {
		super();
		this.hotelId = hotelId;
	}
	
	
	
	
}
