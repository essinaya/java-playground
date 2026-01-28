package oop.inheritance;

public class Airplane extends Vehicle {
	private double wingspan;
    private double altitude;
    private String airline;
    
    public Airplane() {
    	System.out.print("[Airplane] Constructor of Airplane loaded.");
    }
    
    public Airplane(String name, String airline, double wingspan) throws Exception {
    	if(wingspan < 30) {
    		throw new Exception("[Airplane] Wingspan should be more than 30!");
    	}
    	System.out.print("[Airplane] The name of this aircraft is: "+name+ " with airline: "+airline+" wingspan of: "+wingspan);
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
        System.out.println("[Airplane] Airplane taking off. Altitude: " + altitude + " meters.");
    }

    public void land() {
        altitude = 0;
        System.out.println("[Airplane] Airplane has landed.");
    }

    public void deployLandingGear() {
        System.out.println("[Airplane] Landing gear deployed.");
    }

    public void retractLandingGear() {
        System.out.println("[Airplane] Landing gear retracted.");
    }
    
    public String start() {
		return "[Airplane] Airplane is starting!";
    	
    }
    
    public String stop() {
		return "[Airplane] Vehicle is stopping!";
	}
}
