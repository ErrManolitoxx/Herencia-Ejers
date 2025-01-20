package org.ies.Doctors.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cirujano extends Doctor{

    private String hospital;
    private int numBox;

    public Cirujano(String name, String surname, int nc, String[] pacientes, String hospital, int numBox) {
        super(name, surname, nc, pacientes);
        this.hospital = hospital;
        this.numBox = numBox;
    }

    public boolean cirujano(Scanner scanner) {
        String hospitalName = scanner.nextLine();

        if (hospitalName.equals(hospital)) {
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
        return " Cirujano en el Box " + numBox + " del hospital " + hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNumBox() {
        return numBox;
    }

    public void setNumBox(int numBox) {
        this.numBox = numBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cirujano cirujano = (Cirujano) o;
        return numBox == cirujano.numBox && Objects.equals(hospital, cirujano.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, numBox);
    }

    @Override
    public String toString() {
        return "Cirujano{" +
                "hospital='" + hospital + '\'' +
                ", numBox=" + numBox +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nc=" + nc +
                ", pacientes=" + Arrays.toString(pacientes) +
                '}';
    }
}
