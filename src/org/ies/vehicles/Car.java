package org.ies.vehicles;

import java.util.Objects;
import java.util.Scanner;

public class Car extends Vehicles{
    private int numDoors;
    private int horsePower;

    public Car(int totalKm, String plate, int numDoors, int horsePower) {
        super(totalKm, plate);
        this.numDoors = numDoors;
        this.horsePower = horsePower;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numDoors == car.numDoors && horsePower == car.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numDoors, horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", horsePower=" + horsePower +
                ", totalKm=" + totalKm +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Kilómetros realizados con el coche: " + totalKm + " Matrícula: " + plate + " Número de puertas: " + numDoors + " Potencia en caballos: " + horsePower);
    }

    @Override
    public void move(int distance) {
        super.move(distance);
    }
}
