package org.ies.shapes.components;

import org.ies.shapes.model.TriangleRectangle;

import java.util.Scanner;

public class ShapeReader {
    private final SquareReader squareReader;
    private final CircleReader circleReader;
    private final TriangleRectangleReader triangleRectangleReader;
    private final Scanner scanner;

    public ShapeReader(SquareReader squareReader, CircleReader circleReader, TriangleRectangleReader triangleRectangleReader, Scanner scanner) {
        this.squareReader = squareReader;
        this.circleReader = circleReader;
        this.triangleRectangleReader = triangleRectangleReader;
        this.scanner = scanner;
    }
}
