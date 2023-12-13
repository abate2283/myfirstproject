package org.bate.polymorhicthings;

public class MethodOverloading {

    public void m1(int x, int y){
        System.out.println(x + y);

    }
    public void m1(int x){
        System.out.println(x );
    }
    public void m1(int x, char a, double number){
        System.out.println(x +" "+ a +" "+ number );
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.m1(300);
        methodOverloading.m1(400, 500);
        methodOverloading.m1(400, 'z', 4500);

    }
}
