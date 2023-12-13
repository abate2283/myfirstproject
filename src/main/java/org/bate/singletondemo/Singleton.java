package org.bate.singletondemo;

public class Singleton {
    public static final Singleton obj = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return obj;
    }
}
