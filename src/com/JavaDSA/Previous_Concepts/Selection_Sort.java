package com.JavaDSA.Previous_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr= {5,9,7,3,6,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);


    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int getmax= getmaxindex(arr ,0,last);
            swap(arr,getmax,last);
        }
    }

    static void swap(int [] arr, int first , int second){
        int temp = arr [first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getmaxindex(int []arr ,int start , int end){
        int max= start;
        for (int i = start; i <=end ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }


}
