package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;

public class ProjectManager extends Employee{

    private String[] projects;

    public ProjectManager(String nif, String name, String surname, int totalHours) {
        super(nif, name, surname, totalHours);
    }

    @Override
    public void showInfo() {
        System.out.println("El NIF del jefe de proyectos es " + nif + " se llama " + name + " de apellidos " + surname + " con " + totalHours + " horas trabajadas");
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
