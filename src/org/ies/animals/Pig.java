package org.ies.animals;

import java.util.Objects;

public class Pig extends Animal{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pig pig = (Pig) o;
        return Objects.equals(alimentacion, pig.alimentacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alimentacion);
    }

    @Override
    public String toString() {
        return "Pig{" +
                "alimentacion='" + alimentacion + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("Oink, oink");
    }

    @Override
    public void showInfo() {
        System.out.println("Edad de cerdo: " + age + "Alimentación del cerdo: " + alimentacion);
    }
}
