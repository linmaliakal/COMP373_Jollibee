package com.store.model.facility;

import java.util.ArrayList;

public class FacilityDetails{
	private static final int capacity = 30;
	int facilityId = 0;
	int availableCapacity = 0;
	private int useInterval;
	private boolean isInUse;
	private String facilityName;
	private String typeOfFood;
	public ArrayList<Facility> FacilityList = new ArrayList<Facility>();
	
	public int getUseInterval() {
	//returns the use interval, which is the lease for the facility.
		return useInterval;
	}

	public void setUseInterval(int useInterval) {
	//sets the use interval for the facility.
		this.useInterval = useInterval;
	}
	
	public String getFacilityName() {
	//returns the name of the facility.
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
	//set the name of a facility.
		this.facilityName = facilityName;
	}

	public String getTypeOfFood() {
	//returns the type of food that a facility serves.
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
	//sets the type of food that a facility serves.
		this.typeOfFood = typeOfFood;
	}

	public ArrayList<Facility> getFacilityList() {
	//returns the list of facilities.
		return FacilityList;
	}

	public void setFacilityList(ArrayList<Facility> facilityList) {
	//sets the list of facilities.
		FacilityList = facilityList;
	}

	public void setInUse(boolean isInUse) {
	//sets the facility to use.
		this.isInUse = isInUse;
	}

	public int isInUseDuringInterval() {
	// this is the length of the interval of use
		int useInterval = 36;
		return useInterval;
	}

	public int requestAvailableCapacity() {
	//This is how many facilities are in the building
		int availableCapacity = 0;
		availableCapacity = (capacity - FacilityList.size());
		return availableCapacity;
	}
	
	public int calcDownTimeForFacility() {
	//this is the downtime between leases in months
		int downTime = 6;
		return downTime;
	}
	
	public double calcUsageRate () {
	//this is the monthly usage rate. Change these capacities
		double usageRate= 100 * (capacity - requestAvailableCapacity());
		return usageRate * useInterval;
	}
	
	public void listActualUsage() {
	//list the usage of the facility.
		System.out.println("Facility is now renting out " + FacilityList.size() + " out of " + capacity + " units.");
	}

	public boolean isInUse() {
		return isInUse;
	}	
	
}
