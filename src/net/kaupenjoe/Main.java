package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* INTERFACES AND ABSTRACT */

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        bengie.birthday();

        Cat whiskers = new Cat("whiskers.png", "Whiskers", 4);

        bengie.makeSound();
        whiskers.makeSound();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(gracie);
        animals.add(whiskers);

        animals.get(1).makeSound();

        Animal animal = new Dog("jenny.png", "Jenny", 12);
        animal.makeSound();

        // Animal animal1 = new Animal();

        List<IPettable> pets = new ArrayList<>();
        pets.add(bengie);
        pets.add(whiskers);
        pets.add(new Bird("yoshi.png", "Yoshi", 12));

        for(IPettable pet : pets) {
            pet.pet();
        }

        // IFly flying = (IFly)whiskers;
        // flying.fly();

    }
}
