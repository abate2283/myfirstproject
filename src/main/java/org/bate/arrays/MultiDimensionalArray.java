package org.bate.arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int arr [][] =new int [2][2];
        arr[0][0] = 200;
        arr[0][1] = 300;
        arr[1][0] = 400;
        arr[1][1] = 500;


        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
