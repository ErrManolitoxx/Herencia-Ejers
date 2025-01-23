package org.ies.shapes.components;

import org.ies.shapes.model.TriangleRectangle;

import java.util.Scanner;

public class TriangleRectangleReader {
    private final Scanner scanner;

    public TriangleRectangleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public TriangleRectangle read() {
        System.out.println("Introduzca la información del triángulo rectángulo:");

        System.out.println("¿De qué color es el triángulo?");
        String color = scanner.nextLine();

        System.out.println("Medidas de la base del triángulo:");
        double base = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Altura del triángulo:");
        double height = scanner.nextDouble();
        scanner.nextLine();

        return new TriangleRectangle(color, base, height);
    }
}
