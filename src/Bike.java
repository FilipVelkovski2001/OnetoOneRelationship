
public class Bike {

	protected String bikeName;
	protected int modelYear;
	protected int horsePower;
	protected String fuelType;
	
	public Bike(String bikeName, int modelYear, int horsePower, String fuelType) {
		this.bikeName = bikeName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.fuelType = fuelType;
	
	}
	
	public String toString() {
		return bikeName + " "+ modelYear + " " + horsePower + " " + fuelType;
		
	}
	
}
