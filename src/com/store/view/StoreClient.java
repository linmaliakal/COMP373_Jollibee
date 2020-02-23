package com.store.view;

import java.util.*;

import com.store.model.use.Staff;
import com.store.model.use.IUse;
import com.store.model.facility.Facility;
import com.store.model.facility.FacilityDetails;
import com.store.model.maintenance.OrderInfo;
import com.store.model.maintenance.Order;
import com.store.model.maintenance.Maintenance;

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
				
		//add new Facility & it's Details
		Facility facility = new Facility(0);
		facility.setFacilityId(10);
		FacilityDetails facilityDetails = new FacilityDetails();
		facilityDetails.setUseInterval(36);
		facilityDetails.setFacilityName("Taco Bell");
		facilityDetails.setTypeOfFood("mexican");
		facilityDetails.calcUsageRate();
		facilityDetails.calcDownTimeForFacility();
		//facilityDetails.setFacilityList("");
		
		//adds Maintenance Order for Facility
		Order order1 = new Order(12);
		order1.setOrderId(12);
		order1.setRequestDate(12,22019l);
		order1.setRequestTime(12,1200l);
		order1.setOrderCost(12,2000l);
		
		Maintenance maintenance1 = new Maintenance(12);
//		System.out.println(maintenance1.scheduleMaintenance(12));
		maintenance1.setRequestDate(12,400l);
		maintenance1.scheduleMaintenance(12);
		maintenance1.listMaintenance();
		maintenance1.setOrderDetails(12, "FOOD SUPPLIES");
		System.out.println(maintenance1.getOrderDetails(12));
		System.out.println("Maintenance Request (12) includes:"
				+ "\n Date: " + order1.getRequestDate(12)  
				+ "\n Time: " + order1.getRequestTime(12) 
				+ "\n Cost: " + order1.getOrderCost(12));
		System.out.println(maintenance1.makeFacilityMaintRequest(12, "FOOD SUPPLIES"));
		System.out.println("\tName: \t\t\t" + staffPerson.getName() + "\n" + "\tBirthdate: \t\t"+ staffPerson.getBirthdate() + "\n"+ "\tAddress: \t\t" + staffPerson.getAddress() + "\n"+ "\tPhone Number: \t\t" + staffPerson.getPhoneNumber() + "\n" + "\tPosition: \t\t"+ staffPerson.getPosition() + "\n");
		System.out.println("\tFacility ID: \t\t" + facility.getFacilityId());
		System.out.println("\tName of Store: \t\t" + facilityDetails.getFacilityName() + "\n\tType of Food: \t\t" + facilityDetails.getTypeOfFood() + "\n\tFacility Use Interval: \t" + facilityDetails.getUseInterval() + " months" + "\n\tUsage Rate: \t\t" + facilityDetails.calcUsageRate() + "\n\tDown Time: \t\t" + facilityDetails.calcDownTimeForFacility() + " months");
		maintenance1.listMaintRequests();
	}

}
