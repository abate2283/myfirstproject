package org.bate.singletondemo;

public enum UsingEnumInSingleton {
    INSTANCE;
    int i;
    final String s = "Absolutely amazing!";
    public void show(){
        System.out.println(i);
    }

    public String display(){
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        UsingEnumInSingleton usingEnumInSingleton = UsingEnumInSingleton.INSTANCE;
        usingEnumInSingleton.i = 8;
        usingEnumInSingleton.show();
        usingEnumInSingleton.display();
    }
}
