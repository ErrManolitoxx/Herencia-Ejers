package org.ies.Doctors.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Doctor {

    protected String name;
    protected String surname;
    protected  int nc;
    protected String[] pacientes;

    public Doctor(String name, String surname, int nc, String[] pacientes) {
        this.name = name;
        this.surname = surname;
        this.nc = nc;
        this.pacientes = pacientes;
    }
    public void info() {
        System.out.println("Doctor " + doctorInfo() + specificFields() );
    }

    public abstract String doctorInfo();
    public abstract String specificFields();
    public abstract boolean workingHospital();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public String[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(String[] pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return nc == doctor.nc && Objects.equals(name, doctor.name) && Objects.equals(surname, doctor.surname) && Objects.deepEquals(pacientes, doctor.pacientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nc, Arrays.hashCode(pacientes));
    }
}
