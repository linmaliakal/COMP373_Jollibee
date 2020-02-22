package model;
import java.util.*;

public class Facility implements IFacility{
	
	ArrayList<Integer> FacilityList = new ArrayList();
	int facilityId = 0;
	
	
	public Facility(int facilityId) {
		int id = facilityId;
	}
	
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	
	@Override
	public void listFacilities() {
		// TODO Auto-generated method stub
		for(int i=0;i<FacilityList.size();i++) {
			System.out.println(FacilityList.get(i));
		}
		
	}
	public int createFacility() {
		// TODO use getFacility to create a new one and add to the FacilityList
		
		int newFacility = facilityId++;
		FacilityList.add(newFacility);
		return facilityId;
	}
	
	public void removeFacility(int facilityId) {
		// TODO use the given id to remove a facility from FacilityList
		FacilityList.remove(facilityId);
	}

	@Override 
	public void listActualUsage() {
		// TODO come back to this later
		
	}

	
	


}
