package com.store.model.facility;

public class FacilityRequests extends FacilityDetails{
	public FacilityRequests(int facilityId) {
		super(facilityId);
		// TODO Auto-generated constructor stub
	}
	
	public void assignFacilityToUse() {
		
	}
	public void vacateFacility() {
		FacilityList.remove(facilityId);
		
	}
}
