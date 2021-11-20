package net.kaupenjoe;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /* LAMBDA EXPRESSIONS */

        // Functions as Variables
        // Supplier, Consumer, Callable, Runnable, Function

        // Supplier: no parameter, but return value
        // () -> x
        Supplier<Integer> supplier = () -> { return 10; };
        System.out.println(supplier.get());

        // Consumer: one paramtere, but not return value
        // x -> ()
        Consumer<String> consumer = (s) -> { System.out.println(s); };
        consumer.accept("Hello World");

        // Callable: no parameter, and return value
        // () -> x throws Exception
        Callable<Float> callable = () -> { return 100f / 0f; };

        try
        {
            callable.call();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        // Runnable: no paramters, no return value
        // () -> ()
        Runnable runnable = () -> { System.out.println("Hello World again"); };
        runnable.run();

        // Function: has parameter, and return value
        // x -> y
        Function<Double, Double> function = (r) -> { return r * 3.14159265; };
        System.out.println(function.apply(10.0));
    }
}
