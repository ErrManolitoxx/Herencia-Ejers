package org.ies.animals.model;

import java.util.Objects;

public class Dog extends Animal {
    private String raza;

    public Dog(int age, String raza) {
        super(age);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(raza, dog.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raza);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "raza='" + raza + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("Guau, guau");
    }

    @Override
    public void showInfo() {
        System.out.println("Edad del perro: " + age + " Raza del perro:" + raza);
    }
}
