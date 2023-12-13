package org.bate;

public class B {

    public static void main(String[] args) {
       A a1 = new A();
       a1.x = 100;
       a1.y = 200;
        System.out.println(a1.x + " " + a1.y);
        int x = StaticMethod.t2();
    }
}
