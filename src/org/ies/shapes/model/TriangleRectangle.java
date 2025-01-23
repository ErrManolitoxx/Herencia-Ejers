package org.ies.shapes.model;

import java.util.Objects;

public class TriangleRectangle extends Shape{

    private double base;
    private double height;

    public TriangleRectangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TriangleRectangle that = (TriangleRectangle) o;
        return Double.compare(base, that.base) == 0 && Double.compare(height, that.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    @Override
    public String toString() {
        return "TriangleRectangle{" +
                "base=" + base +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("El color del triángulo es " + color + " su base es de " + base + " y su altura es de " + height);
    }

    @Override
    public double area() {
        double area = base * height/2;
        return area;
    }

    @Override
    public void showArea() {
        System.out.println("El area del triángulo rectángulo es de " + area());;
    }
}
