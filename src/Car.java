
public class Car {

	protected String carName;
	protected int modelYear;
	protected int horsePower;
	protected String fuelType;
	
	public Car(String carName, int modelYear, int horsePower, String fuelType) {
		this.carName = carName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.fuelType = fuelType;
	
	}
	
	public String toString() {
		return carName + " "+ modelYear + " " + horsePower + " " + fuelType;
		
	}
}
