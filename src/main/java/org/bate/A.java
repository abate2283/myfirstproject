package org.bate;

public class A {
    String clothing;
    double number;
    public int x;
    public int y;



    public static void main(String[] args) {

        A obj = new A();
        obj.x = 100;
        obj.y = 200;
        System.out.println(obj.x + " " + obj.y);

        A obj1 = new A();
        obj1.x = 500;
        obj1.y = 600;
        System.out.println(obj1.x + " " + obj1.y);

    }
}

