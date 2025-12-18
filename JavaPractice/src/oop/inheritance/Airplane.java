package oop.inheritance;

public class Airplane extends Vehicle {
	private double wingspan;
    private double altitude;
    private String airline;
    
    public Airplane() {
    	System.out.print("✈✈ Constructor of Airplane loaded.");
    }

    public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void takeOff() {
        altitude = 1000;
        System.out.println("Airplane taking off. Altitude: " + altitude + " meters.");
    }

    public void land() {
        altitude = 0;
        System.out.println("Airplane has landed.");
    }

    public void deployLandingGear() {
        System.out.println("Landing gear deployed.");
    }

    public void retractLandingGear() {
        System.out.println("Landing gear retracted.");
    }
    
    public String start() {
		return "Airplane is starting!";
    	
    }
}
