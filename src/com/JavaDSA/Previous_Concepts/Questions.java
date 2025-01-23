package com.JavaDSA.Previous_Concepts;//package com.kunal;


import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        //        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println();
    }

    static boolean search(String str, char target) {

        if (str.length() == 0) {
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    int[][] numm = {
            {1, 8, 9},
            {85, 6, 5, 8,},
            {45, 85, 64, 79, 82}
    };



    static int[] search(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
            if(target == arr[row][col]){
                return new int[]{row,col};
            }
            }
        }
        return new int[]{-1,-1};
        }
    }

