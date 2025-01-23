package org.ies.vehicles.components;

import org.ies.vehicles.model.MotorCycle;

import java.util.Scanner;

public class MotorCycleReader {

    private final Scanner scanner;

    public MotorCycleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public MotorCycle read() {
        System.out.println("Introduzca la información de su moto:");

        System.out.println("¿Cuántos kilómetros ha realizado con ella?");
        int totalkm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Matrícula de la moto:");
        String plate = scanner.nextLine();

        System.out.println("Cilindrada de la moto:");
        int cc = scanner.nextInt();
        scanner.nextLine();

        return new MotorCycle(totalkm, plate, cc);
    }
}
