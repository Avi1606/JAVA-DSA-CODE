package com.JavaDSA.Previous_Concepts;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int []arr= {1,99,92,102,12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    
    static void insertion(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                 if(arr[j-1]>arr[j]){
                     swap(arr ,j,j-1);
                }
                 else{
                     break;
                 }
            }
        }
    }

    static void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
