package oop.inheritance;

public class Audi extends Car {
	private boolean hasVirtualCockpit;
	private boolean quattroSystem;
	
	
	public Audi() {
		System.out.println("⠀⃝ ⠀⃝ ⠀⃝ ⠀⃝ㅤ Audi constructor executed.");
	}
	
	public Audi(boolean hvc, boolean qs) {
		System.out.println("⠀⃝ ⠀⃝ ⠀⃝ ⠀⃝ㅤ Audi constructor 2 with params executed.");
		this.hasVirtualCockpit = hvc;
		this.quattroSystem = qs;
	}
	
	public Audi(boolean hvc, boolean qs, String name,
				double trunkSize, String brand, int numOfDoors) throws Exception {
		System.out.println("⠀⃝ ⠀⃝ ⠀⃝ ⠀⃝ㅤ Audi constructor 3 with params executed.");
		this.hasVirtualCockpit = hvc;
		this.quattroSystem = qs;
		this.setName(name);
		this.setTrunkSize(trunkSize);
		this.setBrand(brand);
		this.setNumberOfDoors(numOfDoors);
	}
	
	
	public boolean isHasVirtualCockpit() {
		return hasVirtualCockpit;
	}

	public void setHasVirtualCockpit(boolean hasVirtualCockpit) {
		this.hasVirtualCockpit = hasVirtualCockpit;
	}

	public boolean isQuattroSystem() {
		return quattroSystem;
	}

	public void setQuattroSystem(boolean quattroSystem) {
		this.quattroSystem = quattroSystem;
	}

	public void enableQuattroMode() {
        if (quattroSystem) {
            System.out.println("Quattro all-wheel drive activated.");
        } else {
            System.out.println("This Audi model does not support Quattro.");
        }
    }
	
	public void activateVirtualCockpit() {
        if (hasVirtualCockpit) {
            System.out.println("Virtual cockpit activated.");
        } else {
            System.out.println("This Audi model does not have a virtual cockpit.");
        }
    }
}
