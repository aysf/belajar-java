package com.example.java;

public class MaxValues {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("byte: " + b);

        // this increment lead to problem since
        // the max value of byte 127
        // b++;
        // System.out.println("byte: " + b);

        // implement logic with helper class
        if (b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("byte: " + b);

    }
}
