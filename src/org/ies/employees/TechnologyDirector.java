package org.ies.employees;

public class TechnologyDirector extends Employee{

    public TechnologyDirector(String nif, String name, String surname, int totalHours) {
        super(nif, name, surname, totalHours);
    }



    @Override
    public String employeeInfo() {
        return " con nif " + nif + " de nombre " + name + " con apellidos" + surname + " con " + totalHours + " horas trabajadas " + specificFields();
    }

    @Override
    public String specificFields() {
        return "";
    }

    @Override
    public void moreHours(int hours) {
        super.moreHours(hours);
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
