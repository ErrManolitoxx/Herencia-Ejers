package org.ies.shapes;

import org.ies.shapes.model.Circle;
import org.ies.shapes.model.Square;
import org.ies.shapes.model.TriangleRectangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Azul", 4);
        Circle circle = new Circle("Verde", 235);
        TriangleRectangle triangleRectangle = new TriangleRectangle("Amarillo", 65, 99);

        square.showInfo();
        circle.showInfo();
        triangleRectangle.showInfo();

        square.showArea();
        circle.showArea();
        triangleRectangle.showArea();
    }
}
