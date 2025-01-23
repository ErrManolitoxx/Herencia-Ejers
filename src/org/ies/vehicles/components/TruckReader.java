package org.ies.vehicles.components;

import org.ies.vehicles.model.Truck;

import java.util.Scanner;

public class TruckReader {

    private final Scanner scanner;

    public TruckReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Truck read() {

        System.out.println("Introduzca la información de su camión:");

        System.out.println("¿Cuántos kilómetros ha realizado en cl ecamión?");
        int totalkm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Matrícula del camión:");
        String plate = scanner.nextLine();

        System.out.println("Número de ejes del camión:");
        int ejes = scanner.nextInt();
        scanner.nextLine();

        return new Truck(totalkm, plate, ejes);
    }
}
