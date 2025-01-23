package com.JavaDSA;

import java.util.Arrays;

public class xyz {

    class Solution {
        public int[][] transpose(int[][] matrix) {
            int [][]ans = new int[matrix.length][matrix.length];

            for(int row=0;row<matrix.length;row++){
                for(int col=0;col<matrix[row].length;col++){
                    ans[col][row] = matrix[row][col];
                }
            }
            return ans;
        }}


    public static void main(String[] args) {
        xyz solution = new xyz();

        // Test Case 1: Basic scenario
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(solution.new Solution().transpose(mat)));
//        System.out.println(Arrays.toString(result1));
    }

}
