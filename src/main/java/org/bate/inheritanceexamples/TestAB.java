package org.bate.inheritanceexamples;

public class TestAB {
    public static void main(String[] args) {
//        A obj = new A();
//        obj.m1();
        B obj1 = new B();
        obj1.m1();
        obj1.m2();

        C obj2 = new C();
        obj2.m1();
        obj2.m3();
    }
}
