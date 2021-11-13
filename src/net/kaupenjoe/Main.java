package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* Classes and Objects */

        // Using the "default Constructor"
        Dog doggo = new Dog();
        System.out.println(doggo.name);

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        System.out.println(bengie.name);
        System.out.println(bengie.age);

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        System.out.println(gracie.name);
        System.out.println(gracie.age);

        bengie.woof();
        gracie.woof();

        bengie.age = 10;
        System.out.println(bengie.age);


    }
}
