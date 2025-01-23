package com.JavaDSA.Recursion.Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int [] arr  = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int []num , int low,int high){
        if(low>= high){
            return;
        }
        //int pivote = num[high +(low - high)/2];
        int end = high;
        int start = low;
        int m = start +(end - start)/2;
        int pivote = num[m];


        while (start<=end){
            while (num[start]<pivote){
                start++;
            }
            while (num[end]>pivote){
                end--;
            }
            if(start<=end){
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }
        sort(num , low , end);
        sort(num , start , high);

    }
}
