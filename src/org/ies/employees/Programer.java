package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Programer extends Employee{

    private String[] languagePro;
    private String project;

    public Programer(String nif, String name, String surname, int totalHours, String[] languagePro, String project) {
        super(nif, name, surname, totalHours);
        this.languagePro = languagePro;
        this.project = project;
    }



    @Override
    public String employeeInfo() {
        return " con nif " + nif + " de nombre " + name + " con apellidos" + surname + " con " + totalHours + " horas trabajadas " + specificFields();
    }

    @Override
    public String specificFields() {
        return " trabaja en los proyectos de " + project + " y conoce los lenguajes de programación " + languagePro;
    }

    public boolean languageProgrammer(Scanner scanner) {
        String lenguaje = scanner.nextLine();

        if (languagePro.equals(lenguaje)) {
            return true;
        }
        return false;
    }

    @Override
    public void moreHours(int hours) {
        super.moreHours(hours);
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
