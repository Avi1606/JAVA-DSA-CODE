package com.JavaDSA.HashMap;

import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println("union  = " + union.size());

        //intersection

        union.clear();

        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        int counter =0;

        for (int i = 0; i < arr2.length; i++) {
            if (union.contains(arr2[i])) {
                counter++;
                union.remove(arr2[i]);
            }
        }
        System.out.println("Intesection = " +counter);


    }
}
