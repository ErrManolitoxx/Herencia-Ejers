package org.ies.shapes.model;

import java.util.Objects;

public class Square extends Shape{

    private double lado;

    public Square(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(lado, square.lado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lado);
    }

    @Override
    public String toString() {
        return "Square{" +
                "lado=" + lado +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("El color del cuadrado es: " + color + " Su radio es " + lado);
    }

    @Override
    public double area() {
        double area = lado * lado;

        return area;
    }

    @Override
    public void showArea() {
        System.out.println("El area del cuadrado es de " + area());;
    }
}
