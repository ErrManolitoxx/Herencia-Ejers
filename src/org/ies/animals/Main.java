package org.ies.animals;

import org.ies.animals.components.AnimalReader;
import org.ies.animals.components.CatReader;
import org.ies.animals.components.DogReader;
import org.ies.animals.components.PigReader;
import org.ies.animals.model.Cat;
import org.ies.animals.model.Dog;
import org.ies.animals.model.Pig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       var dogreader = new DogReader(scanner);
       var catreader = new CatReader(scanner);
       var pigreader = new PigReader(scanner);
       var animalReader= new AnimalReader(
               scanner,
               dogreader,
               catreader,
               pigreader
       );

       var animal = animalReader.read();

       animal.showInfo();
    }
}