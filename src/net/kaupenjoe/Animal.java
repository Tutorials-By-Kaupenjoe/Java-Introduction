package net.kaupenjoe;

public abstract class Animal {
    public String picture;
    protected String name;
    protected int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        this.age++;
    }

    public abstract void makeSound();
}
