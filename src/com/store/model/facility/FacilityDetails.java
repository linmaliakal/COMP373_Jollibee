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
	private ArrayList<Facility> FacilityList = new ArrayList<Facility>();
	
	public int getUseInterval() {
		return useInterval;
	}

	public void setUseInterval(int useInterval) {
		this.useInterval = useInterval;
	}
	
	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public ArrayList<Facility> getFacilityList() {
		return FacilityList;
	}

	public void setFacilityList(ArrayList<Facility> facilityList) {
		FacilityList = facilityList;
	}

	public void setInUse(boolean isInUse) {
		this.isInUse = isInUse;
	}

	public int isInUseDuringInterval() {
		//TODO this is the length of the interval of use
		int useInterval = 36;
		return useInterval;
	}
	
//	public ArrayList<String> addFacilityDetail() {
//		//TODO ask user for input for the new detail. MAKE THIS A HASHMAP
//		String newDetail = "The New Detail";
//		FacilityDetails.add(newDetail);
//		return FacilityDetails;
//	}
	
	public int requestAvailableCapacity() {
		//This is how many facilities are in the building
		int availableCapacity = 0;
		availableCapacity = (capacity - FacilityList.size());
		return availableCapacity;
	}
	
	public int calcDownTimeForFacility() {
		//TODO this is the downtime between leases
		int downTime = 6;
		return downTime;
	}
	
//	public void getFacilityInformation() {
//		//TODO add address and ID
//		System.out.println(addFacilityDetail());
//	}
	
	public double calcUsageRate () {
		//TODO this is the monthly usage rate. Change these capacities
		double usageRate= 100 * (capacity - requestAvailableCapacity());
		return usageRate * useInterval;
	}
	
	public void listActualUsage() {
		System.out.println("Facility is now renting out " + FacilityList.size() + " out of " + capacity + " units.");
	}

	public boolean isInUse() {
		return isInUse;
	}	
	
}
