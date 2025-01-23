package org.ies.vehicles;

import org.ies.vehicles.components.CarReader;
import org.ies.vehicles.components.MotorCycleReader;
import org.ies.vehicles.components.TruckReader;
import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Car;
import org.ies.vehicles.model.MotorCycle;
import org.ies.vehicles.model.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var carReader = new CarReader(scanner);
        var motorCycleReader = new MotorCycleReader(scanner);
        var truckReader = new TruckReader(scanner);
        var vehicleReader = new VehicleReader(carReader, motorCycleReader, truckReader, scanner);

        var vehicle = vehicleReader.read();

        vehicle.showInfo();
    }

}
