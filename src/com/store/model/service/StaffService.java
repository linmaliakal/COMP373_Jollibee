package com.store.model.service;

import com.store.dal.StaffDAO;
import com.store.model.use.Staff;

public class StaffService {
	private StaffDAO staffDAO = new StaffDAO();
	
	//search staff by ID/SSN
	public Staff findStaffById(Long staffSSN) {
			
		try {
			Staff staff = staffDAO.getStaff(staffSSN);
	    	return staff;
	    } catch (Exception se) {
	      System.err.println("StaffService: Threw a Exception retrieving staff.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//Insert a new Staff
	public void addStaff(Staff staff) {
		
		try {
			staffDAO.addStaff(staff);
	    } catch (Exception se) {
	      System.err.println("StaffService: Threw a Exception retrieving staff.");
	      System.err.println(se.getMessage());
	    }
	}

}
