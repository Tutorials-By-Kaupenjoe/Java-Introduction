package net.kaupenjoe;

public class Dog {
    // Adding some fields to the Dog Class
    public String picture;
    protected String name;
    private int age;
    public static final int dogToHumanYearMultiplier = 7;

    // public, protected, private
    // static, final

    // getter
    public int getAge() {
        return age;
    }

    // Default Constructor
    public Dog() {

    }

    // To create a new Object we need a Custom Constructor
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void woof() {
        System.out.println(this.name +  " just woofed!");
    }

    public void birthday() {
        this.age++;
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    public static void outputDog(Dog dog) {
        System.out.println(dog.name);
        System.out.println(dog.age);
    }

}
