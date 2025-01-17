package org.ies.shapes;

import java.util.Objects;

public class Circle extends Shape{

    private double radio;

    public Circle(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radio, circle.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("El cuadrado es de color " + color + "su radio es " + radio);
    }

    @Override
    public double area() {
        double area = Math.PI * radio * radio;
        return area;
    }

    @Override
    public void showArea() {
        System.out.println("El area del círculo es de " + area());;
    }
}
