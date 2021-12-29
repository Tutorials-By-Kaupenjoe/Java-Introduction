package net.kaupenjoe;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // parameter -> expression

        LocalDateTime dateTime = LocalDateTime.now();
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());

        System.out.println("Waiting for 3 Seconds!");
        // Sleep for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());
    }
}
