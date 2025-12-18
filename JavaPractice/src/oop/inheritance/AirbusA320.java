package oop.inheritance;

public class AirbusA320 extends Airplane {
	private boolean flyByWireEnabled;
    private double maxRangeKm;
    
    public AirbusA320() {
    	System.out.print("☆☆✈✈ Constructor of AirbusA320 loaded.");
    }
    
    public AirbusA320(boolean fbwe, double mrk, String airlineName, String name,
    		          double wingspan, double altitude) {
    	System.out.print("☆☆✈✈ Constructor of AirbusA320 with parameters loaded.");
    	this.flyByWireEnabled = fbwe;
    	this.maxRangeKm = mrk;
    	this.setAirline(airlineName);
    	this.setName(name);
    	this.setWingspan(wingspan);
    	this.setAltitude(altitude);
    }
    

    public boolean isFlyByWireEnabled() {
		return flyByWireEnabled;
	}

	public void setFlyByWireEnabled(boolean flyByWireEnabled) {
		this.flyByWireEnabled = flyByWireEnabled;
	}

	public double getMaxRangeKm() {
		return maxRangeKm;
	}

	public void setMaxRangeKm(double maxRangeKm) {
		this.maxRangeKm = maxRangeKm;
	}

	public void activateFlyByWire() {
        if (flyByWireEnabled) {
            System.out.println("Fly-by-wire system activated.");
        } else {
            System.out.println("Fly-by-wire not supported on this model.");
        }
    }

    public void deactivateFlyByWire() {
        System.out.println("Fly-by-wire system deactivated.");
    }
    
    public String start() {
		return "AirbusA320 is starting!";
    	
    }
}
