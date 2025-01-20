package org.ies.Doctors.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Podologo extends Doctor{

    private String hospital;
    private int floor;

    public Podologo(String name, String surname, int nc, String[] pacientes, String hospital, int floor) {
        super(name, surname, nc, pacientes);
        this.hospital = hospital;
        this.floor = floor;
    }

    public boolean podologo(Scanner scanner) {
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
        return " podólogo en el hospital " + hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Podologo podologo = (Podologo) o;
        return floor == podologo.floor && Objects.equals(hospital, podologo.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, floor);
    }

    @Override
    public String toString() {
        return "Podologo{" +
                "hospital='" + hospital + '\'' +
                ", floor=" + floor +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nc=" + nc +
                ", pacientes=" + Arrays.toString(pacientes) +
                '}';
    }
}
