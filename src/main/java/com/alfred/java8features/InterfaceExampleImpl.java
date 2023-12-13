package com.alfred.java8features;

public class InterfaceExampleImpl implements InterfaceExample {
    @Override
    public String getValue(String input, String output) {
        return null;
    }

    @Override
    public float show(float cash) {
        return InterfaceExample.super.show(cash);
    }
}
