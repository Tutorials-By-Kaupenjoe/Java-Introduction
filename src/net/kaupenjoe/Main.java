package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Inheritance */

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
    }
}
