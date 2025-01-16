package org.ies.vehicles;

import java.util.Objects;

public class Truck extends Vehicles{
    private int numEjes;

    public Truck(int totalKm, String plate, int numEjes) {
        super(totalKm, plate);
        this.numEjes = numEjes;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return numEjes == truck.numEjes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEjes);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numEjes=" + numEjes +
                ", totalKm=" + totalKm +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Kilómetros realizados con el camión: " + totalKm + " Matrícula: " + plate + " Número de ejes: " + numEjes);
    }
}
