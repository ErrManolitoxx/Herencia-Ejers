package org.ies.employees;

import java.util.Objects;

public class ProductManager extends Employee{

    private String project;

    public ProductManager(String nif, String name, String surname, int totalHours, String project) {
        super(nif, name, surname, totalHours);
        this.project = project;
    }

    @Override
    public String employeeInfo() {
        return " con nif " + nif + " de nombre " + name + " con apellidos" + surname + " con " + totalHours + " horas trabajadas " + specificFields();
    }

    @Override
    public String specificFields() {
        return " y se encuentra en el proyecto " + project;
    }

    @Override
    public void moreHours(int hours) {
        super.moreHours(hours);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductManager that = (ProductManager) o;
        return Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), project);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", totalHours=" + totalHours +
                '}';
    }
}
