package org.ies.vehicles;

public class Car extends Vehicles{
    protected int numEjes;

    public Car(int totalKm, String plate, int numEjes) {
        super(totalKm, plate);
        this.numEjes = numEjes;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
