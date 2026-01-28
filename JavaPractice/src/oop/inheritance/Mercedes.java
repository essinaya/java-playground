package oop.inheritance;

public class Mercedes extends Car {
	private String ambientLightingColor;
    private boolean autoPilotEnabled;
    
    public Mercedes() {
    	System.out.println("[Mercedes] Mercedes constructor executed.");
    }
    
    public Mercedes(double trunkSize, String brand, int numOfDoors,
    				String alc, boolean ape, String name) throws Exception {
    	System.out.println("[Mercedes] Mercedes constructor with params executed.");
    	this.setTrunkSize(trunkSize);
    	this.setBrand(brand);
    	this.setNumberOfDoors(numOfDoors);
    	this.ambientLightingColor = alc;
    	this.autoPilotEnabled = ape;
    	this.setName(name);
    }
    

    public String getAmbientLightingColor() {
		return ambientLightingColor;
	}

	public void setAmbientLightingColor(String ambientLightingColor) {
		this.ambientLightingColor = ambientLightingColor;
	}

	public boolean isAutoPilotEnabled() {
		return autoPilotEnabled;
	}

	public void setAutoPilotEnabled(boolean autoPilotEnabled) {
		this.autoPilotEnabled = autoPilotEnabled;
	}

	public void changeAmbientLighting(String color) {
        ambientLightingColor = color;
        System.out.println("[Mercedes] Ambient lighting changed to " + color);
    }

    public void enableAutoPilot() {
        if (autoPilotEnabled) {
            System.out.println("[Mercedes] AutoPilot engaged. Sit back and relax.");
        } else {
            System.out.println("[Mercedes] This model does not support AutoPilot.");
        }
    }
    public String start() {
		return "[Mercedes] Mercedes is starting!";
    	
    }
}
