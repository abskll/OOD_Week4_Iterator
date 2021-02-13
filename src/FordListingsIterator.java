import java.util.Iterator;

public class FordListingsIterator implements Iterator<ListingsVehicles>{
	ListingsVehicles[] list;
	int position = 0;
 
	public FordListingsIterator(ListingsVehicles[] list) {
		this.list = list;
	}
 
	public ListingsVehicles next() {
		ListingsVehicles ListingsVehicle = list[position];
		position = position + 1;
		return ListingsVehicle;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove a Vehicle until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}
