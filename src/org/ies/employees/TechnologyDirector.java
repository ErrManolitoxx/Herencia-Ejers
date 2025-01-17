package org.ies.employees;

public class TechnologyDirector extends Employee{

    public TechnologyDirector(String nif, String name, String surname, int totalHours) {
        super(nif, name, surname, totalHours);
    }

    @Override
    public void showInfo() {
        System.out.println("El director de tecnología tiene el NIF " + nif + " se llama " + name + " de apellidos " + surname + " y con " + totalHours + " horas trabajadas.");
    }

    @Override
    public String toString() {
        return "TechnologyDirector{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", totalHours=" + totalHours +
                '}';
    }
}
