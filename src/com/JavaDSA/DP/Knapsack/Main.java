package com.JavaDSA.DP.Knapsack;

public class Main {
    public static int knapsack(int[] val, int[] wt, int W, int n) {
        // Base case
        if(n == 0 || W == 0) {
            return 0;
        }

        if(wt[n-1] <= W) {  // Changed < to <= to include equal weight items
            // include
            int ans1 = val[n-1] + knapsack(val, wt, W - wt[n-1], n-1);

            // exclude
            int ans2 = knapsack(val, wt, W, n-1);  // Fixed: W instead of W-wt[n-1]

            return Math.max(ans2, ans1);  // Added return statement to choose max value
        }
        else { // not valid - item weight more than capacity
            return knapsack(val, wt, W, n-1);
        }
    }

    public static int Memorization(int val[], int wt[], int W, int n, int dp[][]) {
        if(W == 0 || n == 0) {
            return 0;
        }

        if(dp[n][W] != -1) {
            return dp[n][W];
        }

        if(wt[n-1] <= W) {  // Changed < to <= and fixed the condition
            // include
            int ans1 = val[n-1] + Memorization(val, wt, W - wt[n-1], n-1, dp);
            // exclude
            int ans2 = Memorization(val, wt, W, n-1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // When item weight is more than capacity, only exclude is possible
            dp[n][W] = Memorization(val, wt, W, n-1, dp);  // Fixed: removed W-wt[n-1]
            return dp[n][W];
        }
    }

    public static void main(String[] args) {
        int val [] = {15,14,10 ,45, 30};
        int wt []  = {2,5,1,3,4};
        int W =7;
        int dp[][] = new int[val.length+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack(val , wt , W , val.length));

        System.out.println(Memorization(val , wt , W , val.length,dp));
    }
}
