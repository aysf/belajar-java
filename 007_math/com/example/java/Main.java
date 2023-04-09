package com.example.java;

public class Main {
    public static void main(String[] args) {
        int intVal1 = 56;
        int intVal2 = 42;

        int result1 = intVal1 + intVal2;
        System.out.println("addition: " + result1);

        int result2 = intVal1 - intVal2;
        System.out.println("substraction: " + result2);

        int result3 = intVal1 * intVal2;
        System.out.println("multiplication: " + result3);

        // this result will in-accurate
        // int result4 = intVal1 / intVal2;

        // solution convert to double
        double result4 = (double) intVal1 / intVal2;
        System.out.println("division: " + result4);

        int result5 = intVal1 % intVal2;
        System.out.println("remainder: " + result5);

        double dVal = -3.888;
        long rounded = Math.round(dVal);
        System.out.println("rounded: " + rounded);

        double absVal = Math.abs(dVal);
        System.out.println("absolute: " + absVal);

    }
}
