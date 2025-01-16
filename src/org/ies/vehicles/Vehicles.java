package org.ies.vehicles;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicles vehicles = (Vehicles) o;
        return totalKm == vehicles.totalKm && Objects.equals(plate, vehicles.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalKm, plate);
    }

    public abstract void showInfo();
    public abstract void move();
}
