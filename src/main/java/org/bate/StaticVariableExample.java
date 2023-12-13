package org.bate;

import java.util.Objects;

public class StaticVariableExample {
    static int number = 10000;
    static String value = " Number: ";

    int x;
    int y;

    public static void main(String[] args) {
        System.out.println(value + "" + number);

        StaticVariableExample s2 = new StaticVariableExample();
        s2.x = 200;
        s2.y = 300;
        System.out.println(s2.x + " " + s2.y);
        // initialize means give the initial value; First value.

    }
}
