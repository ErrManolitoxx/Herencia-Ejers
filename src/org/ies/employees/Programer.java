package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;

public class Programer extends Employee{

    private String[] languagePro;
    private String project;

    public Programer(String nif, String name, String surname, int totalHours, String[] languagePro, String project) {
        super(nif, name, surname, totalHours);
        this.languagePro = languagePro;
        this.project = project;
    }

    @Override
    public void showInfo() {
        System.out.println("El NIF del programador es " + nif + " se llama " + name + " de apellidos " + surname + " con " + totalHours + " horas de trabajo ");
    }



    public String[] getLanguagePro() {
        return languagePro;
    }

    public void setLanguagePro(String[] languagePro) {
        this.languagePro = languagePro;
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
        Programer programer = (Programer) o;
        return Objects.deepEquals(languagePro, programer.languagePro) && Objects.equals(project, programer.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(languagePro), project);
    }

    @Override
    public String toString() {
        return "Programer{" +
                "languagePro=" + Arrays.toString(languagePro) +
                ", project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", totalHours=" + totalHours +
                '}';
    }
}
