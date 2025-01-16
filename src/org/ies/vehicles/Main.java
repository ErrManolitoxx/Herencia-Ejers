package org.ies.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(90, "09798SVJ", 5, 230);
        MotorCycle motorCycle = new MotorCycle(14798, "02179LYU", 1000);
        Truck truck = new Truck(70214, "21709HNW", 4);
        Scanner scanner = new Scanner(System.in);

        truck.showInfo();
        car.showInfo();
        motorCycle.showInfo();

        System.out.println("¿Cuantos kilómtros más ha recorriod?");
        int distance= scanner.nextInt();
        scanner.nextLine();



    }

}
