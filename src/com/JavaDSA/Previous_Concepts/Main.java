package com.JavaDSA.Previous_Concepts;//import java.util.*;
//
////public class JAVADSA.Main{
////    public static void main(String[] args) {
////        Scanner sc =new Scanner(System.in);
////
////        int [] arr = new int[5];
//////        arr[0] = 1;
//////        arr[1] = 2;
//////        arr[3] = 3;
////
////
////       // System.out.println(arr[3]);
////
////        for(int i =0 ; i<arr.length; i++){
////            //System.out.println("Enter the value which you want to add in arr");
////            arr[i] = sc.nextInt();
////        }
////        for (int i =0 ; i<arr.length ;i++){
////            System.out.print(arr[i] + " ");
////        }
////
////    }
////}
//
//
////public class Array {
//
//    public class JAVADSA.Main {
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//
////            int [][] arr =new int[4][3];
////
////            for(int row = 0; row <arr.length; row++) {
////                for (int col = 0; col < arr[row].length; col++) {
////                    arr[row][col] = sc.nextInt();
////                }
////            }
////            System.out.println(arr.length);
////
////
////            //System.out.println("Enter the elements for 2D Array :");
////
////            for(int row = 0; row <arr.length; row++){
////                for(int col=0;col<arr[row].length;col++){
////                    System.out.print(arr[row][col]+" ");
////                }
////                System.out.println();
////            }
//
////            ArrayList<Integer> marks = new ArrayList<Integer>(5);
////
////            marks.add(2555);
////
////            System.out.println(marks.get(0));
//
////            int [] arrnum  = {15 ,25 ,56,85,75,13};
////
////            swap(1,5);
////
////            System.out.println(Arrays.toString(arrnum));
////
////            static void swap( int index1, int index2){
////                int temp = arrnum[index1];
////                arrnum[index1] = arrnum[index2];
////                arrnum[index2] =temp;
////
////
////            }
////            int[] arr = {1, 3, 23, 9, 18, 56};
////            swap(arr, 0, 4);
////
////
////            static void swap(int[] arr, int index1, int index2) {
////                int temp = arr[index1];
////                arr[index1] =5, arr[index2];
////                arr[index2] = temp;
////            }
//
//
//           int [] num = {1,85,5,9,2,8,6,7,};
////
////            System.out.println("Enter the target no : ");
////            int target = sc.nextInt();
////
////            for (int i = 0; i<num.length ;i++) {
////                if(target == num[i]){
////                    System.out.println(i);
////                }
////
////            }
////        static int search(int[] num, int target);{
////            if(arr.length()==0){
////                return -1;
////            }
////
////            for()
////
////            }
//        }
//    }
//


//public class JAVADSA.Main{
//    public static void main(String[] args) {
//        System.out.println("This is basic sorting algorithm: ");
//        int []numbers = { 1 , 85,6,45,4,9};
//        System.out.println(sort(numbers));
//    }
//    static int sort(int [] arr){
//        int a = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (a>arr[i]){
//                a=arr[i];
//            }
//
//        }
//        return a;
//    }
//}

public class Main {

    static int binarysearch(int[] array, int target , int start , int end) {


        while (start <= end) {

            int mid = start + (end - start) / 2;


            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int orderagnostic(int []arr, int target) {
        int start =0;
        int end = arr.length-1;
        boolean as;
        while(start<=end){

            if (arr[start]<arr[end]){
                as = true;
            }else{
                as = false;
            }

            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }

            if (as) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                if(arr[mid]>target){
                    start=mid+1;
                } else if (arr[mid] < target) {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    static void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
//        int[] arr = {-25, -15, -8, -6, -3, 0, 12, 45, 89, 95, 100};
//        int target= 12;
//        int ans = binarysearch(arr,target);
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target=5;
        int ans = orderagnostic(arr,target);
        System.out.println(ans);

    }
}
