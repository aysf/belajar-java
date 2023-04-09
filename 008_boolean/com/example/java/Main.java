package com.example.java;

public class Main {

    static boolean vBool;

    public static void main(String[] args) {

        // local variable must be initialized
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("vBool: " + vBool);

        boolean b3 = !b1;
        System.out.println("b3: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("b4: " + b4);

        String sBool = "true";
        boolean parseBool = Boolean.parseBoolean(sBool);
        System.out.println("b5: " + parseBool);
    }
}
