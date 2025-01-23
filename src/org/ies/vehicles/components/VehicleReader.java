package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicles;

import java.util.Scanner;

public class VehicleReader {

    private final CarReader carReader;
    private final MotorCycleReader motorCycleReader;
    private final TruckReader truckReader;
    private final Scanner scanner;

    public VehicleReader(CarReader carReader, MotorCycleReader motorCycleReader, TruckReader truckReader, Scanner scanner) {
        this.carReader = carReader;
        this.motorCycleReader = motorCycleReader;
        this.truckReader = truckReader;
        this.scanner = scanner;
    }
    
    public Vehicles read() {
        System.out.println("Eliga el vehículo que desee:");
        
        int option;
        do {
            System.out.println("1. Coche.");
            System.out.println("2. Moto.");
            System.out.println("3. Camión.");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option < 0 || option > 3);
        
        if (option == 1) {
            return carReader.read();
        } 
        else if (option == 2) {
            return motorCycleReader.read();
        }
        else {
            return truckReader.read();
        }
    }
}
