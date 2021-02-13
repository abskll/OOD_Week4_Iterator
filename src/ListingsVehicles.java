
public class ListingsVehicles {
	String name;
	String description;
	boolean SUV;
	double price;
 
	public ListingsVehicles(String name, 
	                String description, 
	                boolean SUV, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.SUV = SUV;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isSUV() {
		return SUV;
	}
}
