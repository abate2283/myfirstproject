package org.bate.arrays;

public class Array3 {
    public static void min(int arr[]){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int z [] = {33, 4, 5};
        min(z);

    }
}
