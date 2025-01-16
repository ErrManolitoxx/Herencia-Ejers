package org.ies.animals;

public abstract class Cat extends Animal {
    protected String color;

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

    public void talk() {
        System.out.println("Miau");
    }

    public void showInfo() {
        System.out.println("Edad del gato: " + age + " Color del gato: " + color);
    }
}
