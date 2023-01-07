/**
 * 
 */
package com.infogalaxy.employeeservice.response;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
public class AddressResponse {
	//id, lane 1, lane 2, state, zipcode, employee_id
	
	private int id;
	
	private String lane1;
	
	private String lane2;
	
	private String state;
	
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
