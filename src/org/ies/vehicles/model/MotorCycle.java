package org.ies.vehicles.model;

import java.util.Objects;

public class MotorCycle extends Vehicles {

    private int cc;

    public MotorCycle(int totalKm, String plate, int cc) {
        super(totalKm, plate);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MotorCycle that = (MotorCycle) o;
        return cc == that.cc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cc);
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "cc=" + cc +
                ", totalKm=" + totalKm +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Kilómetros realizados con la moto: " + totalKm + " Matrícula: " + plate + " Cilindrada de la moto: " + cc);
    }

    @Override
    public void move(int distance) {
        super.move(distance);
    }
}
