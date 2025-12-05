package oop.inheritance;

public class Vehicle {

	private double speed;
	private int capacity;
	private double fuelLevel;
	private double weight;
	private String name;
	
	public Vehicle() {
		System.out.println("✇✇ Vehicle constructor executed.");
	}
	
	public Vehicle(double speed, int capacity, double fuelLevel, double weight) {
		System.out.println("✇✇ Vehicle constructor with params executed.");
		this.speed = speed;
		this.capacity = capacity;
		this.fuelLevel = fuelLevel;
		this.weight = weight;
	}
	
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String start() {
		return "✇✇ Vehicle is starting!";
	}
	
	public String stop() {
		speed = 0;
		return "✇✇ Vehicle is stopping!";
	}
	
	public void accelerate(double amount) {
        speed += amount;
        System.out.println("✇✇ Accelerating by " + amount + " km/h. Current speed: " + speed);
    }
	
	public void brake(double amount) {
        speed = Math.max(0, speed - amount);
        System.out.println("✇✇ Braking by " + amount + " km/h. Current speed: " + speed);
    }
	
	public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("✇✇ Refueled " + liters + " liters. Current fuel: " + fuelLevel);
    }
	
}
