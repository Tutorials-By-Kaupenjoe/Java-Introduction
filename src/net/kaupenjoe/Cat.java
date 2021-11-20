package net.kaupenjoe;

public class Cat extends Animal implements IPettable {
    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just meowed!");
    }

    @Override
    public void pet() {
        System.out.println("Petted " + this.name);
    }
}
