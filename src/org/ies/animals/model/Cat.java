package org.ies.animals.model;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(int age, String color) {
        super(age);
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
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("Miau");
    }

    @Override
    public void showInfo() {
        System.out.println("Edad del gato: " + age + " Color del gato: " + color);
    }
}
