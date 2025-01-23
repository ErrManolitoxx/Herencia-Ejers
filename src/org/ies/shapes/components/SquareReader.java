package org.ies.shapes.components;

import org.ies.shapes.model.Square;

import java.util.Scanner;

public class SquareReader {

    private final Scanner scanner;

    public SquareReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Square read(){

        System.out.println("Introduzca la información sobre el círculo");

        System.out.println("¿De qué color es el círculo?");
        String color = scanner.nextLine();

        System.out.println("Medida del lado del cuadrado");
        double side = scanner.nextDouble();
        scanner.nextLine();

        return new Square(color, side);
    }


}
