/**
 * 
 */
package com.infogalaxy.addressservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
@Entity
@Table( name = "address" )
public class Address {
	
	//id, lane 1, lane 2, state, zipcode, employee_id
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id")
	private int id;
	
	@Column( name = "lane1" )
	private String lane1;
	
	@Column( name = "lane2")
	private String lane2;
	
	@Column( name = "state")
	private String state;
	
	@Column( name = "zipcode" )
	private long zipcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLane1() {
		return lane1;
	}

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public String getLane2() {
		return lane2;
	}

	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
}
