package net.kaupenjoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* ARRAYLIST, MAPS AND SETS (Collections) */

        String[] questions = new String[2];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";

        List<String> questionsList = new ArrayList<>(); // No need to define the length
        questionsList.add("What Language is spoke in Germany?");
        questionsList.add("What is the Capital of Canada?");
        questionsList.add("In what Hemisphere is Brazil?");

        // Lists --> you can add entries dynamically

        // Removing is fairly easy
        questionsList.remove(1);

        System.out.println(questionsList.size());

        System.out.println(questionsList.get(0));

        // List<int> numbers = new ArrayList<int>();
        // Generics don't work with primitive datatypes
        // Wrapper Classes you can use instead
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(1337);

        // MAPS
        // map a Key to a certain Value. Called Key-Value Pairs
        Map<String, String> CountryToCapital = new HashMap<>();
        CountryToCapital.put("Germany", "Berlin");
        CountryToCapital.put("France", "Paris");
        CountryToCapital.put("Italy", "Rome");
        CountryToCapital.put("USA", "Washington DC");

        // To get a Value of a Map you have to supply it a Key
        System.out.println(CountryToCapital.get("Germany"));

        System.out.println("Contains Key 'Germany'? " + CountryToCapital.containsKey("Germany"));
        System.out.println("Contains Value 'London'? " + CountryToCapital.containsValue("London"));

        System.out.println(CountryToCapital.remove("France"));

        // SETS
        // A Set is a collection that contains not duplicates
        Set<String> usernames = new HashSet<>();
        usernames.add("Kaupenjoe");
        usernames.add("Nanoattack");

        System.out.println(usernames.add("FRV"));
        System.out.println(usernames.add("FRV"));


        /* ERROR YOU MIGHT RUN INTO */
        // Uncomment to see Errors

        // IndexOutOfBoundException
        // If you try and pass in an Index that does not exist for a list
        // System.out.println(questionsList.get(2));

        // Not an Exception, BUT "null"
        // If you pass in a Key into a Map that does not exist
        // Your return value is going to be null (might lead to other errors down the line!)
        // System.out.println(CountryToCapital.get("Malta"));
    }
}
