package org.ies.employees;

public class Main {
    public static void main(String[] args) {

        Programer programer = new Programer("JSOW3634", "Mario", "García Cácerez", 23403, new String[]{"Phyton, Java, JavaScript, C++"}, "Creación de un videojuego");
        ProductManager productManager = new ProductManager("DERGI2367", "Francisco", "Vega Rodríguez", 23759, "Creación de una base de datos");
        ProjectManager projectManager = new ProjectManager("ERPI726", "Alberto", "Cabezon Martín", 1985, new String[]{"Phyton, Java"});
        TechnologyDirector technologyDirector = new TechnologyDirector("SIBP3407", "Diego", "Marisco", 34095);

        productManager.moreHours(5238);
        productManager.info();

        programer.moreHours(9823);
        programer.info();

        projectManager.moreHours(6);
        projectManager.info();

        technologyDirector.moreHours(918);
        technologyDirector.info();
    }
}
