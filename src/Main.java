
public class Main {

	public static void main(String[] args) {

		Car c1 = new Car("Honda Civic", 2016, 200, "Petrol");
		Bike b1 = new Bike("Suzuki Ninja", 2018, 150, "Petrol");
		Truck t1 = new Truck("Volvo Master", 2020, 190, "Diesel");
		
		Car c2 = new Car("Audi A4", 2018, 210, "Petrol");
		Bike b2 = new Bike("Toyata Supra", 2016, 250, "Petrol");
		Truck t2 = new Truck("Mercedes Schleper", 2019, 185, "Diesel");
		
		Car cars[] = {c1, c2};
		Bike bikes[] = {b1, b2};
		Truck trucks[] = {t1, t2};
		
		Vehicles v = new Vehicles(cars, bikes, trucks);

		System.out.println(v.getVehicles());		
		
		
	
	}
	
}
