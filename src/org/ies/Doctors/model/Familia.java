package org.ies.Doctors.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Familia extends Doctor{

    private String namehospital;

    public Familia(String name, String surname, int nc, String[] pacientes, String namehospital) {
        super(name, surname, nc, pacientes);
        this.namehospital = namehospital;
    }

    public boolean familia(Scanner scanner) {
        String hospitalname = scanner.nextLine();

        if (hospitalname.equals(namehospital)) {
            return true;
        }
        return false;
    }

    @Override
    public String doctorInfo() {
        return  name + " con apellidos " + surname + " con número de colegiado " + nc;
    }

    @Override
    public String specificFields() {
        return " médico de familia en el centro de saslud de " + namehospital;
    }

    public String getNamehospital() {
        return namehospital;
    }

    public void setNamehospital(String namehospital) {
        this.namehospital = namehospital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Familia familia = (Familia) o;
        return Objects.equals(namehospital, familia.namehospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), namehospital);
    }

    @Override
    public String toString() {
        return "Familia{" +
                "namehospital='" + namehospital + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nc=" + nc +
                ", pacientes=" + Arrays.toString(pacientes) +
                '}';
    }
}
