package oop.inheritance;

public class Boeing737 extends Airplane {
	private String engineType;
    private int passengerCount;

    public Boeing737() {
    	System.out.print("☆✈✈Constructor of Boeing737 loaded.");
    }
    
    public Boeing737(String et, int pc,String airlineName, String name,
    				 double wingspan, double altitude) {
    	System.out.print("☆✈✈Constructor of Boeing737 with parameters loaded.");
    	this.engineType = et;
    	this.passengerCount = pc;
    	this.setAirline(airlineName);
    	this.setName(name);
    	this.setWingspan(wingspan);
    	this.setAltitude(altitude);
    }
    
    public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public void deployFlaps() {
        System.out.println("Flaps deployed for increased lift.");
    }

    public void retractFlaps() {
        System.out.println("Flaps retracted for cruise flight.");
    }
}
