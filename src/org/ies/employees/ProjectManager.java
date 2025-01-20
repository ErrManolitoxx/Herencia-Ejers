package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ProjectManager extends Employee{

    private String[] projects;

    public ProjectManager(String nif, String name, String surname, int totalHours, String[] strings) {
        super(nif, name, surname, totalHours);
    }


    @Override
    public String employeeInfo() {
        return " con nif " + nif + " de nombre " + name + " con apellidos" + surname + " con " + totalHours + " horas trabajadas " + specificFields();
    }

    @Override
    public String specificFields() {
        return " trabaja en los proyectos de " + projects ;
    }

    public boolean projectManager(Scanner scanner) {
        String project = scanner.nextLine();

        if (project.equals(projects)) {
            return true;
        }
        return false;
    }

    @Override
    public void moreHours(int hours) {
        super.moreHours(hours);
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.deepEquals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(projects));
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "projects=" + Arrays.toString(projects) +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", totalHours=" + totalHours +
                '}';
    }
}
