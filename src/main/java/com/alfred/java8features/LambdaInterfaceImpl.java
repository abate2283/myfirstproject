package com.alfred.java8features;

public class LambdaInterfaceImpl {
    public static void main(String[] args) {

        Runnable run = () -> {
            System.out.println("running");
        };

        run.run();

        LambdaInterface lambdaInterface = () -> {
            System.out.println("Inside lambda");

        };
        lambdaInterface.getString();
    }

    LambdaTwo lambdaTwo = (a) -> {
        return "This is the result!";
    };

}


