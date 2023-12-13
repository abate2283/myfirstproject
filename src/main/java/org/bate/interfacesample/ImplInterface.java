package org.bate.interfacesample;

public class ImplInterface implements InterfaceDemo{

    @Override
    public String run() {
        System.out.println("This is the first interface implementation!");
        return "This is the first interface implementation!";
    }

    public static void main(String[] args) {
        ImplInterface obj = new ImplInterface();
        obj.run();

    }
}
