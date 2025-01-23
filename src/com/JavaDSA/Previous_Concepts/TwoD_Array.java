package com.JavaDSA.Previous_Concepts;

public class TwoD_Array {
    public static void main(String[] args) {

    }
    int arr;

    static int [] search(int [][] arr, int target){
        int col=arr.length-1;
        int row = 0;

        while (row<arr.length && col>0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
