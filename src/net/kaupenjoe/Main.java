package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Inheritance */

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        Cat whiskers = new Cat("whiskers.png", "whiskers", 4);

        // bengie.woof();
        // gracie.woof();

        System.out.println(bengie.getAge());
        whiskers.makeNoise();
        bengie.makeNoise();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(gracie);
        animals.add(whiskers);

        for(Animal animal : animals) {
            animal.makeNoise();
        }
    }
}
