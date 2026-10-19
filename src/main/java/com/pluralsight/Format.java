package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String firstName = "Jada";
        String lastName = "Keels";

        // Print both ways
        String fullName = formatName(firstName, lastName);
        System.out.println(fullName);

        System.out.println(formatName(firstName, lastName));
    }
    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}