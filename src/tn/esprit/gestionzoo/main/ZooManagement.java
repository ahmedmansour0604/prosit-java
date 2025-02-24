package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.function.DoublePredicate;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());
        /*Aquatic aqua = new Aquatic();
        Terrestrial terr =  new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
         */
        Aquatic aqua = new Aquatic("Fish", 2, false, "sea");
        Terrestrial terr = new Terrestrial("Insects","Ant",1,false,6);
        Dolphin dolphin = new Dolphin("MrDolphin",3,true,"Ocean",15);
        Penguin penguin1 = new Penguin("MrPenguin1",5,false,"Greenland",10);
        Penguin penguin2 = new Penguin("MrPenguin2",5,false,"Greenland",1.5f);
        Penguin penguin3 = new Penguin("MrPenguin3",5,false,"Greenland",11.1f);
        Penguin penguin4 = new Penguin("MrPenguin3",5,true,"Greenland",111.1f);


        System.out.println(aqua);
        System.out.println(terr);
        System.out.println(dolphin);
        System.out.println(penguin1);

        aqua.swim();
        dolphin.swim();
        penguin1.swim();
        System.out.println("---------------------------------------");
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(aqua);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin3);
        myZoo.aquaticSwim();
        System.out.println("---------------------------------------");
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(penguin3.equals(penguin2));
    }
}
