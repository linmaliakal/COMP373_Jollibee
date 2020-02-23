package com.store.model.use;

import java.util.ArrayList;
import java.util.List;

//import other class packages needed

public class Staff {
	
	private long staffSSN;
	private String name;
	private String birthdate;
	private String address;
	private Long phoneNumber;
	private String position;
	//private List<> allStaff = new ArrayList<>();
	
	public Staff(long staffSSN, String name, String birthdate, String address, Long phoneNumber, String position) {
		this.staffSSN = staffSSN;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.position = position;
	}

	public long getStaffSSN() {
		return staffSSN;
	}

	public void setStaffSSN(long staffSSN) {
		this.staffSSN = staffSSN;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
