package org.ies.employees;

import java.util.Objects;

public abstract class Employee {
    protected String nif;
    protected String name;
    protected String surname;
    protected int totalHours;


    public Employee(String nif, String name, String surname, int totalHours) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.totalHours = totalHours;
    }
    public void info(){
        System.out.println("Empleado " + employeeInfo() + specificFields());
    }

    public abstract String employeeInfo();
    public abstract String specificFields();


    public void moreHours(int hours) {
        hours += totalHours;
        System.out.println("Usted ha trabajado " + hours + " extras");
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

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

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return totalHours == employee.totalHours && Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, totalHours);
    }

}
