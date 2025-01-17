package org.ies.shapes;

import java.util.Objects;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    public abstract double area();

    public abstract void showInfo();

    public abstract void showArea();
}
