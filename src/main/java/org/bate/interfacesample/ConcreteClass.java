package org.bate.interfacesample;

public class ConcreteClass {

    public String getString(){
        System.out.println("This method is from a concrete class  ");
        return "This is a concrete method ";
    }

    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.getString();
        obj.getString();
        obj.getString();

    }
}
