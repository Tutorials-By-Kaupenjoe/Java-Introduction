package net.kaupenjoe;

import net.kaupenjoe.banking.Person;

public class Main {
    public static void main(String[] args) {
        /* ANONYMOUS CLASSES */

        Person nano = new Person("Nano", "Attack", 8);

        Person manager = new Person("John", "Smith", 42) {
            @Override
            public String getFullName() {
                return "Manager " + super.getFullName();
            }
        };

        System.out.println(nano.getFullName());
        System.out.println(manager.getFullName());
    }
}
