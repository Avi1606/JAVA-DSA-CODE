package com.JavaDSA.Greedy;

import java.util.Arrays;

public class mimuma_absolute_value {
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        System.out.println(helper(A, B));
    }

    private static int helper(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int min =0;
        for (int i = 0; i < a.length; i++) {
            min +=Math.abs(a[i] - b[i]) ;
        }
        return min;
    }
}

