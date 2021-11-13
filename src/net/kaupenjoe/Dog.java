package net.kaupenjoe;

public class Dog {
    // Adding some fields to the Dog Class
    public String picture;
    public String name;
    public int age;

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

}
