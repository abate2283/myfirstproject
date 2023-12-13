package com.alfred.exception;

public class ThrowException {
    public static void validatedDate(int age){
        if(age < 18){
            throw new ArithmeticException("Person is no eligible to vote! ");
        } else {
            System.out.println("Person is eligible to vote.");
        }

        if(age < 15)
            throw new ArithmeticException("Not eligible.");
        else System.out.println("They're eligible.");
    }

    public static void main(String[] args) {
        validatedDate(13);
        System.out.println("rest of code...");


    }
}
