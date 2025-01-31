package com.JavaDSA.DP.Memoization;

public class Main {

    static int fibo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println( fibo(6,new int[7]));
    }
}