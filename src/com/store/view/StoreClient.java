package com.store.view;

import java.util.List;

import com.store.model.use.Staff;
import com.store.model.use.IUse;
import com.store.model.facility.Facility;
import com.store.model.facility.FacilityDetails;

public class StoreClient {
	
	public static void main (String args[]) throws Exception {
		
		//adding a new Staff member
		Staff staffPerson = new Staff();
		staffPerson.setStaffSSN(123456789l);
		staffPerson.setName("Lindsay Chaplin");
		staffPerson.setBirthdate("01/20/1987");
		staffPerson.setAddress("6301 N Sheridan Road, Evanston, IL 60660");
		staffPerson.setPhoneNumber(8474019233l);
		staffPerson.setPosition("Manager");
		
		//TODO add new Facility & it's Details
		Facility facility = new Facility(0);
		facility.setFacilityId(10);
		FacilityDetails facilityDetails = new FacilityDetails();
		facilityDetails.setUseInterval(36);
		facilityDetails.setFacilityName("Taco Bell");
		facilityDetails.setTypeOfFood("mexican");
		facilityDetails.calcUsageRate();
		//facilityDetails.setFacilityList("");
		
		//TODO add Maintenance
		//TODO add Maintenance Order for Facility
		
		System.out.println("\tName: \t\t\t" + staffPerson.getName() + "\n" + "\tBirthdate: \t\t"+ staffPerson.getBirthdate() + "\n"+ "\tAddress: \t\t" + staffPerson.getAddress() + "\n"+ "\tPhone Number: \t\t" + staffPerson.getPhoneNumber() + "\n" + "\tPosition: \t\t"+ staffPerson.getPosition() + "\n");
		System.out.println("\tFacility ID: \t\t" + facility.getFacilityId());
		System.out.println("\tFacility Use Interval: \t\t" + facilityDetails.getUseInterval() + "\n\tName of Store: \t\t" + facilityDetails.getFacilityName() + "\n\tType of Food: \t\t" + facilityDetails.getTypeOfFood() + "\n\tUsage Rate: \t\t" + facilityDetails.calcUsageRate());
	}

}
