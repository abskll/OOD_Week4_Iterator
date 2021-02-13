import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UNITTESTLISTINGS {

	@Test
	void test() {
		FordListings FordListings = new FordListings();

		 
		Auctioner Auctioner = new Auctioner(FordListings);
 
		assertFalse(Auctioner.isVehicleSUV("Ford F450"));
		assertTrue(Auctioner.isVehicleSUV("Ford Bronco Sport"));
		assertTrue(Auctioner.isVehicleSUV("Ford Mustang Mach-E"));
		assertFalse(Auctioner.isVehicleSUV("Ford Mustang"));
		assertFalse(Auctioner.isVehicleSUV("Ford Shelby GT500"));
		assertFalse(Auctioner.isVehicleSUV("Ford F-150 Raptor"));
	}

}
