package com.alfred.exception;

import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        try {
            System.out.println("Start program...");
            System.out.println("Hello...");
            System.out.println("Another...");
            System.out.println(10/0);
            String s = null;
            String s1 = "abc";
            int a [] = new int [5];
            a[10] = 50;
           System.out.println(a[10]);

        } catch (NullPointerException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println("bye...");
            System.out.println("end program...");
        } finally {
            System.out.println("finally block is always executed");

        }

    }
}
