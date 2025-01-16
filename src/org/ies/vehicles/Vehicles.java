package org.ies.vehicles;

public abstract class Vehicles {
    protected int totalKm;
    protected String plate;

    public Vehicles(int totalKm, String plate) {
        this.totalKm = totalKm;
        this.plate = plate;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
