package com.example.java;

public class Main {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("the 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("the long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("the short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("the byte value is " + byteValue);

        double dValue = 3.5555;
        int intValue4 = (int) dValue;
        System.out.println("double to int is " + intValue4);

    }
}
