package org.ies.animals;

public class Main {
    public static void main(String[] args) {
       var cat = new Cat(1, "negro");
       var dog = new Dog(4, "Chucho");
       var pig = new Pig(5, "Almendras");

       cat.showInfo();
    }
}