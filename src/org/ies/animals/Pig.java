package org.ies.animals;

public abstract class Pig extends Animal{
    protected String alimentacion;

    public Pig(int age, String alimentacion) {
        super(age);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void talk() {
        System.out.println("Oink, oink");
    }

    public void showInfo() {
        System.out.println("Edad de cerdo: " + age + "Alimentación del cerdo: " + alimentacion);
    }
}
