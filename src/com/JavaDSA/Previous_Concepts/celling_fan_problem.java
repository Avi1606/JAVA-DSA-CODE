package com.JavaDSA.Previous_Concepts;

public class celling_fan_problem {

    static int fan(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }else if (arr[i]>target)
                return arr[i];
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int taget = 14;
        System.out.println(fan(num,taget));
    }
}