package org.ies.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(90, "09798SVJ", 5, 230);
        MotorCycle motorCycle = new MotorCycle(14798, "02179LYU", 1000);
        Truck truck = new Truck(70214, "21709HNW", 4);

        truck.move(500);
        truck.showInfo();

        car.move(80000);
        car.showInfo();

        motorCycle.move(4000);
        motorCycle.showInfo();





    }

}
