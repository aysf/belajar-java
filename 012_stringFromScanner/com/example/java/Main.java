package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Dunia";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append(", ");
        // sb.append("World");
        // sb.append("!");

        // alternative style
        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");

        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);
        // scanner.close();

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);
    }
}
