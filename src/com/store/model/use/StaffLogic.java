package com.store.model.use;

import java.util.HashSet;

import com.store.dal.StaffDAO;

public class StaffLogic {
	
	//public Staff getStaff(Long staffSSN) {
		//StaffDAO sd = new StaffDAO();
		//Staff staff = sd.getStaffByID(staffSSN);
		//return staff;
	//}
	
	public HashSet<Staff> getAllStaff() {
		StaffDAO pd = new StaffDAO();
		HashSet<Staff> allStaff = new HashSet<Staff>();
		//allStaff = pd.getAllStaff();
		return allStaff;
	}

}
