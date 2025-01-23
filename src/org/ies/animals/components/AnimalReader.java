package org.ies.animals.components;

import org.ies.animals.model.Animal;

import java.util.Scanner;

public class AnimalReader {

    private final Scanner scanner;
    private final DogReader dogReader;
    private final CatReader catReader;
    private final PigReader pigReader;

    public AnimalReader(Scanner scanner, DogReader dogReader, CatReader catReader, PigReader pigReader) {
        this.scanner = scanner;
        this.dogReader = dogReader;
        this.catReader = catReader;
        this.pigReader = pigReader;
    }

    public Animal read() {
        System.out.println("¿Qué animal tiene como mascota?");
        int option;
        do {
            System.out.println("¿Qué animal tiene como mascota?");
            System.out.println("1. Un perro.");
            System.out.println("2. Un gato.");
            System.out.println("3. Un cerdo.");
            option = scanner.nextInt();
            scanner.nextLine();


        }while (option < 0 || option > 3);

        if (option == 1) {
            return dogReader.read();
        }
        else if (option == 2) {
            return catReader.read();
        }
        else {
            return pigReader.read();
        }

    }


}
