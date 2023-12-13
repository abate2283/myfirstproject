package org.bate;

public class InstanceVariable {

     static final int name = 200;
     int aName = 200;

     static final int color = 300;


    public static void getDetails(){


        System.out.println(name + color);
    }

    public static void main(String[] args) {
       getDetails();
        // object is the instance of a class.


    }
}
