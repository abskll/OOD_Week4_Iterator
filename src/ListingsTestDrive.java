
public class ListingsTestDrive {
	public static void main(String args[]) {

		FordListings FordListings = new FordListings();

 
		Auctioner Auctioner = new Auctioner(FordListings);
 
		Auctioner.printListings();
		Auctioner.printSUVListings();

		System.out.println("\nCustomer asks, is the Ford F450 an SUV?");
		System.out.print("Auctioner says: ");
		if (Auctioner.isVehicleSUV("Ford F450")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, are the Ford Bronco Sports SUVs?");
		System.out.print("Auctioner says: ");
		if (Auctioner.isVehicleSUV("Ford Bronco Sport")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
