package net.kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* STRINGS AND STRING-METHODS */

        String sentence = "It's a wonderful Java Series!";
        System.out.println(sentence);
        System.out.println("Length is: " + "-" + sentence.length());

        // Upper and lower case
        System.out.println("Shouting: " + sentence.toUpperCase());
        System.out.println("Whispering: " + sentence.toLowerCase());
        System.out.println(sentence);

        // indexOf
        System.out.println("The word 'Java' is found at position: " + sentence.indexOf("Java"));

        // Replace
        System.out.println(sentence.replace("Java", "C#"));

        String s = "";
        boolean empty = s.isEmpty();
        System.out.println(empty);

        // startsWith and endsWith
        System.out.println(sentence.startsWith("I"));
        System.out.println(sentence.endsWith("A"));

        // contains
        System.out.println(sentence.contains("Java")); //true

        // charAt
        System.out.println(sentence.charAt(17));

        // substring
        s = sentence.substring(17);
        System.out.println(s);


    }
}
