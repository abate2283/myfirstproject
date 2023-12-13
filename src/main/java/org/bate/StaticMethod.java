package org.bate;

public class StaticMethod {
    public static void t1(){
        System.out.println("Welcome Here!");
    }
    public static int t2(){
        return 100;
    }

    public static void main(String[] args) {
        t1();
        t2();
    }

}
