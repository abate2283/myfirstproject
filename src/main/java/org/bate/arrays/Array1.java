package org.bate.arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

    int a [] = {200, 4000, 6902, 8908, 10987};
        System.out.println(a[4]);
//        Arrays.stream(a).filter(x->x==2).forEach(System.out::println);

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]*2);
            System.out.println(a[i]/2);
            System.out.println(a[i]%2);

        }
        for(int arr: a){
            System.out.println(arr);
        }
    }
}
