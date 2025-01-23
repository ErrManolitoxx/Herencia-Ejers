package org.ies.shapes.components;

import org.ies.shapes.model.Circle;

import java.util.Scanner;

public class CircleReader {

    private final Scanner scanner;

    public CircleReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Circle read(){

        System.out.println("Introduzca la información del círculo:");

        System.out.println("¿De qué color es el círculo?");
        String color = scanner.nextLine();

        System.out.println("¿Cuánto mide el radio del círculo?");
        double radio = scanner.nextDouble();
        scanner.nextLine();

        return new Circle(color, radio);
    }
}
