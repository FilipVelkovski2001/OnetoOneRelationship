
public class Truck {

	protected String truckName;
	protected int modelYear;
	protected int horsePower;
	protected String fuelType;
	
	public Truck(String truckName, int modelYear, int horsePower, String fuelType) {
		this.truckName = truckName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.fuelType = fuelType;
	
	}
	
	public String toString() {
		return truckName + " "+ modelYear + " " + horsePower + " " + fuelType;
		
	}
	
}
