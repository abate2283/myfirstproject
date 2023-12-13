package org.bate.generical;

public class GenericMethod <T,P, Q> implements nonGenericInterface{
    private Q c;

    private T a;

    private P b;

    public P display(P p){
        System.out.println(Math.sqrt((Double) p));
        return p;
    }

    public Q getC(){return c;}
    public void setC(Q c){this.c = c;}

    public P getB() {
        return b;
    }

    public void setB(P b) {
        this.b = b;
    }

    public T getA(){
        return a;
    }



    public void setA(T a){
        this.a = a;
    }

    public static void main(String[] args) {
        GenericMethod<String, Double, Float> genericMethod = new GenericMethod<>();
        genericMethod.display(45.45);
    }

    @Override
    public void get() {

    }
}
