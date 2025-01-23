package org.ies.animals.components;

import org.ies.animals.model.Dog;

import java.util.Objects;
import java.util.Scanner;

public class DogReader {

    private final Scanner scanner;

    public DogReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Dog read() {
        System.out.println("Introduzca la información de su perro:");

        System.out.println("¿Qué edad tiene su perro?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿De qué raza es su perro?");
        String breed = scanner.nextLine();

        return new Dog(age, breed);
    }
}
