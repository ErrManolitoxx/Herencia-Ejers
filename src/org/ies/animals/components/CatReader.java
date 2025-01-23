package org.ies.animals.components;

import org.ies.animals.model.Cat;

import java.util.Scanner;

public class CatReader {

    private final Scanner scanner;


    public CatReader(Scanner scanner) {
        this.scanner = scanner;

    }

    public Cat read() {

        System.out.println("Introduzca la información sobre su gato:");

        System.out.println("¿Qué edad tiene su gato?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿De qué color es su gato?");
        String color = scanner.nextLine();

        return new Cat(age, color);
    }
}
