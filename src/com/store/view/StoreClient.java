package com.store.view;

import java.util.List;

import com.store.model.use.Staff;
import com.store.model.use.IUse;

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
		
		System.out.println("\tName: \t\t\t" + staffPerson.getName() + "\tBirthdate: \t\t\t"+ staffPerson.getBirthdate() + "\tAddress: \t\t\t" + staffPerson.getAddress() + "\tPhone Number: \t\t\t" + staffPerson.getPhoneNumber() + "\tPosition: \t\t\t"+ staffPerson.getPosition() + "\n");
	}

}
