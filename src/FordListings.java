import java.util.Iterator;

public class FordListings implements Listings{
	static final int MAX_VehicleS = 6;
	int numberOfVehicles = 0;
	ListingsVehicles[] ListingsVehicles;
  
	public FordListings() {
		ListingsVehicles = new ListingsVehicles[MAX_VehicleS];
 
		addVehicle("Ford Mustang Mach-E",
			"2021 SUV", true, 42895);
		addVehicle("Ford Mustang",
			"2021 Sedan", false, 27155);
		addVehicle("Ford F450",
			"2021 Pickup Truck", false, 50410);
		addVehicle("Ford Shelby GT500",
			"2021 Sedan",
			false, 70300);
		addVehicle("Ford Bronco Sport",
			"2021 SUV", true, 26820);
		addVehicle("Ford F-150 Raptor",
			"2021 Pickup Truck",
			false, 59000);
	}
  
	public void addVehicle(String name, String description, 
	                     boolean SUV, double price) 
	{
		ListingsVehicles ListingsVehicle = new ListingsVehicles(name, description, SUV, price);
		if (numberOfVehicles >= MAX_VehicleS) {
			System.err.println("Sorry, Listings is full!  Can't add Vehicle to Listings");
		} else {
			ListingsVehicles[numberOfVehicles] = ListingsVehicle;
			numberOfVehicles = numberOfVehicles + 1;
		}
	}
 
	public ListingsVehicles[] getListingsVehicles() {
		return ListingsVehicles;
	}
  
	public Iterator<ListingsVehicles> createIterator() {
		return new FordListingsIterator(ListingsVehicles);
		//return new AlternatingFordListingsIterator(ListingsVehicles);
	}
 
	// other Listings methods here
}
