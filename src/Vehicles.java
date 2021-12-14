
public class Vehicles {
	
	private Car cars[];
	private Bike bikes[];
	private Truck trucks[];
	
	public Vehicles() {
		
	}
	
	public Vehicles(Car cars[], Bike bikes[], Truck trucks[]) {
		this.cars = cars;
		this.bikes = bikes;
		this.trucks = trucks;
	}
	
	public String getVehicles(){
		return cars[0].carName + " "+ cars[0].modelYear + " " 
				+ cars[0].horsePower + " " + cars[0].fuelType +" " + cars[1].carName + " "+ cars[1].modelYear + " " 
				+ cars[1].horsePower + " " + cars[1].fuelType + " "+ bikes[0].bikeName + " "+ bikes[0].modelYear + " " + bikes[0].horsePower + " " + bikes[0].fuelType +
				 " "+ bikes[1].bikeName + " "+ bikes[1].modelYear + " " + bikes[1].horsePower + " " + bikes[1].fuelType + " "+
				 trucks[0].truckName + " "+ trucks[0].modelYear + " " + trucks[0].horsePower +
					" " + trucks[0].fuelType + " " + trucks[1].truckName + " "+ trucks[1].modelYear + " " + trucks[1].horsePower +
					" " + trucks[1].fuelType;
	}
	
	public String getCars() {
		return  cars[0].carName + " "+ cars[0].modelYear + " " 
				+ cars[0].horsePower + " " + cars[0].fuelType +" " + cars[1].carName + " "+ cars[1].modelYear + " " 
				+ cars[1].horsePower + " " + cars[1].fuelType ;
	}
	public void setCars(Car cars[]) {
		this.cars = cars;
	}
	public String getBikes() {
		return bikes[0].bikeName + " "+ bikes[0].modelYear + " " + bikes[0].horsePower + " " + bikes[0].fuelType +
				 " "+ bikes[1].bikeName + " "+ bikes[1].modelYear + " " + bikes[1].horsePower + " " + bikes[1].fuelType;
	}
	public void setBikes(Bike bikes[]) {
		this.bikes = bikes;
	}
	public String getTrucks() {
		return trucks[0].truckName + " "+ trucks[0].modelYear + " " + trucks[0].horsePower +
				" " + trucks[0].fuelType + " " + trucks[1].truckName + " "+ trucks[1].modelYear + " " + trucks[1].horsePower +
				" " + trucks[1].fuelType; 
	}
	public void setTrucks(Truck trucks[]) {
		this.trucks = trucks;
	}
	
}
