package com.JavaDSA.Previous_Concepts;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
    int []arr= {1,99,92,102,12};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
    }

   static void bubble(int [] arr){
       for (int i = 0; i < arr.length; i++) {
           for (int j = 1; j < arr.length-i; j++) {
               if(arr[j]<arr[j-1]){
                   int temp= arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }
           }
       }
   }
}
