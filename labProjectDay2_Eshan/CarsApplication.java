package labProjectDay2_Eshan;

import java.util.Scanner;

class Vehicle {
	protected int noOfWheels, noOfPassenger, model;
	protected String make;

	public Vehicle(String make2, int model2, int noOfPassenger2, int noOfWheels2) {
		this.make = make2;
		this.model = model2;
		this.noOfPassenger = noOfPassenger2;
		this.noOfWheels = noOfWheels2;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("noOfPassenger: " + noOfPassenger);
		System.out.println("noOfWheels: " + noOfWheels);
	}
}

class Car extends Vehicle {
	protected int noOfDoors;

	public Car(String make, int model, int noOfPassenger, int noOfWheels, int noOfDoors2) {
		super(make, model, noOfPassenger, noOfWheels);
		this.noOfDoors = noOfDoors2;
	}

	public void display() {
		super.display();
		System.out.println("No of doors= "+noOfDoors);
	}
}

class Convertible extends Car {
	public Convertible(String make, int model, int noOfPassenger, int noOfWheels, int noOfDoors2, boolean isHoodOpen2) {
		super(make, model, noOfPassenger, noOfWheels, noOfDoors2);
		this.isHoodOpen = isHoodOpen2;
	}

	private boolean isHoodOpen;

	public void display() {
		super.display();
		if(isHoodOpen)
			System.out.println("Hood is open");
		else
			System.out.println("Hood is not open");
	}
}

class SportsCar extends Car {
	public SportsCar(String make, int model, int noOfPassenger, int noOfWheels, int noOfDoors2) {
		super(make, model, noOfPassenger, noOfWheels, noOfDoors2);
	}
	public void display() {
		super.display();
	}
}

public class CarsApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Create object: Enter 1 for vehicle, 2 for car, 3 for convertible, 4 for sportscar, 5 for exit");
		int choice = scan.nextInt();
		System.out.println("Enter make, model, no of passengers & no of wheels");
		String make = scan.next();
		int model = scan.nextInt();
		int noOfPassenger = scan.nextInt();
		int noOfWheels = scan.nextInt();
		if (choice == 1) {
			Vehicle v = new Vehicle(make, model, noOfPassenger, noOfWheels);
			v.display();
		} else if (choice == 2) {
			System.out.println("Enter the no of doors");
			int noOfDoors = scan.nextInt();
			Car c = new Car(make, model, noOfPassenger, noOfWheels, noOfDoors);
			c.display();
		} else if (choice == 3) {
			System.out.println("Enter the no of doors");
			int noOfDoors = scan.nextInt();
			System.out.println("Is hood open? 1 for yes, 2 for no");
			boolean hood = scan.nextBoolean();
			Convertible cc = new Convertible(make, model, noOfPassenger, noOfWheels, noOfDoors, hood);
			cc.display();
		} else if (choice == 4) {
			System.out.println("Enter the no of doors");
			int noOfDoors = scan.nextInt();
			SportsCar s = new SportsCar(make, model, noOfPassenger, noOfWheels, noOfDoors);
			s.display();
		}
		scan.close();
	}

}
