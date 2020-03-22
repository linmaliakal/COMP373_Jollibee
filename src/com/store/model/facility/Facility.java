package com.store.model.facility;

import java.util.*;

public class Facility extends FacilityRequests implements IFacility{
	
	
	public Facility(int facilityId) {
	//create facility with an Id number
		super(facilityId);
	}
	
	public int getFacilityId() {
	//get facility id
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
	//set the facility id
		this.facilityId = facilityId;
	}
	
	@Override
	public void listFacilities() {
	//list all facilities
		for(int i=0;i<FacilityList.size();i++) {
			System.out.println(FacilityList.get(i));
		}
		
	}
	public int createFacility() {
		//use to create a new one and add to the FacilityList
		Facility facility = new Facility(facilityId);
		FacilityList.add(facility);
		facilityId++;
		return facilityId;
	}
	
	public void removeFacility(int facilityId) {
		// TODO use the given id to remove a facility from FacilityList
		FacilityList.remove(facilityId);
	}

	
	


}
