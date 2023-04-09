package com.example.java;

public class Main {

    public static void main(String[] args) {

        // example 1
        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("they don't match!");
        }

        // example 2
        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("they don't match!");
        }

        // example 3-a
        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4 == str5) {
            System.out.println("They match!");
        } else {
            System.out.println("they don't match!");
        }

        // example 3-b
        if (str4.equals(str5)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        // example 3-c
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
    }
}
