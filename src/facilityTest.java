import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.store.model.facility.Facility;

class facilityTest {
	
		Facility facility = new Facility(0);
	@BeforeEach
	void setUp() throws Exception {
		
		facility.getFacilityList();
		facility.setFacilityId(1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
