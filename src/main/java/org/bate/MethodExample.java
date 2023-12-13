package org.bate;

public class MethodExample {
    public void f1(){
        System.out.println("hi");
    }
    public int f2(){
        return 10 + 299;
    }
    public int f3(int x, int y){
        return y * 2 * x;
    }

    public static void main(String[] args) {
        MethodExample m = new MethodExample();
        m.f1();
        m.f2();
        System.out.println(m.f3(10, 20));
    }

}
