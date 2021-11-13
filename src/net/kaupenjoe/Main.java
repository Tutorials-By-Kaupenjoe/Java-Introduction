package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* Access Modifiers */

        // Using the "default Constructor"
        Dog doggo = new Dog();
        System.out.println(doggo.name);

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        System.out.println(bengie.name);
        System.out.println(bengie.getAge());

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        Dog.outputDog(gracie);

        bengie.woof();
        gracie.woof();

        System.out.println(bengie.getAgeInHumanYears());


    }
}
