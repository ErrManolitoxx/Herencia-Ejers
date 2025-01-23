package org.ies.vehicles.components;

import org.ies.vehicles.model.Car;

import java.util.Scanner;

public class CarReader {

    private final Scanner scanner;

    public CarReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Car read() {
        System.out.println("Introduzca la información sobre su coche:");

        System.out.println("¿Cuántos kilómetros ha realizado?");
        int totalkm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Matrícula del coche:");
        String plate = scanner.nextLine();

        System.out.println("Número de puertas del coche:");
        int doors = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuántos caballos tiene su coche?");
        int cv = scanner.nextInt();
        scanner.nextLine();

        return new Car(totalkm, plate, doors, cv);
    }
}
