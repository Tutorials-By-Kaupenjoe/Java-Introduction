package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* GENERICS */
        List<Integer> numbers = new ArrayList<>();

        Pair<Integer, ?> pair = new Pair<>(20, 2f);

    }
}
