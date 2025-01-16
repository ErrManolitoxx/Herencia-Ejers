package org.ies.animals;

public abstract class Dog extends Animal {
    protected String raza;

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

    public void talk() {
        System.out.println("Guau, guau");
    }

    public void showInfo() {
        System.out.println("Edad del perro: " + age + " Raza del perro:" + raza);
    }
}
