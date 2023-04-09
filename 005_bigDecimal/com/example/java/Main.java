package com.example.java;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double value = .012;
        System.out.println("val: " + value);

        double pSum = value + value + value;
        System.out.println("sum of primitive: " + pSum);

        String strValue = Double.toString(value);
        System.out.println("strVal: " + strValue);

        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("strVal: " + bSum.toString());

    }
}
