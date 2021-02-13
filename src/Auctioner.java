import java.util.Iterator;

public class Auctioner {
	Listings FordListings;
 
	public Auctioner(Listings FordListings) {
		this.FordListings = FordListings;
	}
 
	public void printListings() {
		Iterator<ListingsVehicles> FordIterator = FordListings.createIterator();

		System.out.println("Listings\n");
		System.out.println("\nFORD");
		printListings(FordIterator);
	}
 
	private void printListings(Iterator<ListingsVehicles> iterator) {
		while (iterator.hasNext()) {
			ListingsVehicles ListingsVehicle = iterator.next();
			System.out.print(ListingsVehicle.getName() + ", ");
			System.out.print(ListingsVehicle.getPrice() + " -- ");
			System.out.println(ListingsVehicle.getDescription());
		}
	}
 
	public void printSUVListings() {
		System.out.println("\nSUV Listings\n---------------");
		printSUVListings(FordListings.createIterator());
	}
 
	public boolean isVehicleSUV(String name) {
		Iterator<ListingsVehicles> FordIterator = FordListings.createIterator();
		if (isSUV(name, FordIterator)) {
			return true;
		}
		return false;
	}


	private void printSUVListings(Iterator<ListingsVehicles> iterator) {
		while (iterator.hasNext()) {
			ListingsVehicles ListingsVehicle = iterator.next();
			if (ListingsVehicle.isSUV()) {
				System.out.print(ListingsVehicle.getName() + ", ");
				System.out.print(ListingsVehicle.getPrice() + " -- ");
				System.out.println(ListingsVehicle.getDescription());
			}
		}
	}

	private boolean isSUV(String name, Iterator<ListingsVehicles> iterator) {
		while (iterator.hasNext()) {
			ListingsVehicles ListingsVehicle = iterator.next();
			if (ListingsVehicle.getName().equals(name)) {
				if (ListingsVehicle.isSUV()) {
					return true;
				}
			}
		}
		return false;
	}
}
