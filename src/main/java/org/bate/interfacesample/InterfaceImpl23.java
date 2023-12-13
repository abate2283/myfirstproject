package org.bate.interfacesample;

public class InterfaceImpl23 implements InterfaceDemo{
    @Override
    public String run() {
        System.out.println("This is a different implementation");
        return "enter";
    }

    public static void main(String[] args) {
        InterfaceImpl23 obj = new InterfaceImpl23();
        obj.run();
    }
}
