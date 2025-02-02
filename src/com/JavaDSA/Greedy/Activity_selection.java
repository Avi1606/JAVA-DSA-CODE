package com.JavaDSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Activity_selection {
    public static void main(String[] args) {
        int activityes[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.println(helper(activityes));;
    }

    private static int helper(int a[][]) {
        Arrays.sort(a, Comparator.comparing(o -> o[1]));
        int chainlen = 1;
        int endpoint = a[0][1];

        for (int i = 1; i < a.length; i++) {
            if (a[i][0] > endpoint) {
                chainlen++;
                endpoint = a[i][1];
            }
        }
        return chainlen;
    }
}

