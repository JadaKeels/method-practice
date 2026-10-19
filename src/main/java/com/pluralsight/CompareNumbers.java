package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isEven(12));
        System.out.println(isPositive(32));
        System.out.println(isPositive(-31));
    }

    public static boolean isEven(int num) {
        return (num % 2) == 0;
    }

    public static boolean isPositive(double num) {
        return (num > 0);
    }
}
