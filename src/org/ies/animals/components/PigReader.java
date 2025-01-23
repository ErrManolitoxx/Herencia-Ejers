package org.ies.animals.components;

import org.ies.animals.model.Pig;

import java.util.Scanner;

public class PigReader {

    private final Scanner scanner;


    public PigReader(Scanner scanner) {
        this.scanner = scanner;

    }

    public Pig read() {
        System.out.println("Introduzca la información sobre su cerdo:");

        System.out.println("¿Qué edad tiene el cerdo?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Qué como su cerdo?");
        String alimentacion = scanner.nextLine();

        return new Pig(age, alimentacion);
    }
}
