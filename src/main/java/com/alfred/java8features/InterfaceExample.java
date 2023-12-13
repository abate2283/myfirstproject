package com.alfred.java8features;

public interface InterfaceExample {
    String getValue(String input, String output);
    default public float show(float cash){
        return cash;
    }

    static double amountEarned(double deposit){

        return deposit;
    }
}
