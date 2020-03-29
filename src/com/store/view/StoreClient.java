package com.store.view;

import java.util.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.store.model.use.Staff;
import com.store.model.use.IUse;
import com.store.model.service.StaffService;
import com.store.model.facility.Facility;
import com.store.model.facility.FacilityDetails;
import com.store.model.maintenance.OrderInfo;
import com.store.model.maintenance.Order;
import com.store.model.maintenance.Maintenance;

public class StoreClient {
	
	public static void main (String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        Staff staffPerson = (Staff) context.getBean("staff");
		//adding a new Staff member
        //Staff staff = staffPerson.getStaff();
		//Staff staffPerson = new Staff();
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
		System.out.println("\tName: \t\t\t" + staffPerson.getName() + "\n" + "\tBirthdate: \t\t"+ staffPerson.getBirthdate() + "\n"+ "\tAddress: \t\t" + staffPerson.getAddress() + "\n"+ "\tPhone Number: \t\t" + staffPerson.getPhoneNumber() + "\n" + "\tPosition: \t\t"+ staffPerson.getPosition() + "\n");
		System.out.println("\tFacility ID: \t\t" + facility.getFacilityId());
		System.out.println("\tName of Store: \t\t" + facilityDetails.getFacilityName() + "\n\tType of Food: \t\t" + facilityDetails.getTypeOfFood() + "\n\tFacility Use Interval: \t" + facilityDetails.getUseInterval() + " months" + "\n\tUsage Rate: \t\t" + facilityDetails.calcUsageRate() + "\n\tDown Time: \t\t" + facilityDetails.calcDownTimeForFacility() + " months\n");
	
		//adds Maintenance Order for Facility
		Order order1 = new Order(12);
		Order order2 = new Order(13);
		
		order1.setOrderId(12);
		order1.setRequestDate("22/01/2019");
		order1.setRequestTime("12:00PM");
		order1.setCost(3000);
		
		order2.setOrderId(13);
		order2.setRequestDate("13/10/2020");
		order2.setRequestTime("3:00PM");
		order2.setCost(500);
		
//		//Testing for maintenance
		Maintenance maintenance = new Maintenance(12);
		maintenance.setRequestDate("12/23/2020");
		maintenance.scheduleMaintenance(12);
		maintenance.listMaintenance();
		maintenance.makeFacilityMaintRequest(12, "FOOD SUPPLIES");
		maintenance.setRequestDate("13/10/2020");
		maintenance.scheduleMaintenance(13);
//		maintenance.setOrderDetails(13, "INSPECTION");
//	
//		System.out.println("Order details are as follows:");
//		System.out.println(maintenance.getOrderDetails(12));
//		System.out.println(maintenance.getOrderDetails(13));
//		
//		System.out.println("Maintenance Request (12) includes:" //Sample report of maintenance request.
//				+ "\n Date: " + order1.getRequestDate(12)  
//				+ "\n Time: " + order1.getRequestTime(12) 
//				+ "\n Cost: " + order1.getOrderCost(12));
//		System.out.println(maintenance.makeFacilityMaintRequest(12, "FOOD SUPPLIES"));
//		System.out.println(maintenance.makeFacilityMaintRequest(13, "INSPECTION"));
//		maintenance.listMaintRequests(); //List all maintenance requests and their functions.
//		System.out.println(maintenance.listInspections());
	}

}
