package org.ies.Doctors;

import org.ies.Doctors.model.Cirujano;
import org.ies.Doctors.model.Familia;
import org.ies.Doctors.model.Podologo;

public class Main {
    public static void main(String[] args) {

        Cirujano cirujano = new Cirujano("Nerea", "Blanco baltazar", 03475, new String[]{"Nicolás, Sergio"}, "Doce de Octubre", 230957);
        Familia familia = new Familia("Matilda", "Nieves blanca", 025707, new String[]{"Dánae, Franco"}, "Francisco del Yerro");
        Podologo podologo = new Podologo("Juancho", "Marqués de la Fuente", 2357297, new String[]{"Sergio, Jaime, Iker, Alberto, Luis, Nelson"}, "Doce de Octubre", 7);

        cirujano.info();
        familia.info();
        podologo.info();
    }
}
