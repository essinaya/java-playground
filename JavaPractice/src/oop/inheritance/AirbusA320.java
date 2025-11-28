package oop.inheritance;

public class AirbusA320 extends Airplane {
	private boolean flyByWireEnabled;
    private double maxRangeKm;

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
}
