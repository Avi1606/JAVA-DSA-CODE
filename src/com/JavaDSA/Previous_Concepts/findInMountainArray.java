package com.JavaDSA.Previous_Concepts;

public class findInMountainArray {

    public static void main(String[] args) {

    }
    int search(int [] arr, int target){
        int peak = peakindexmountain(arr);
        int firsttry = binarysearch(arr , target , 0, peak);
        if(firsttry != -1){
            return firsttry;
        }
        return orderagnostic(arr , target,peak+1,arr.length-1);

    }


    static int peakindexmountain(int arr[]){
        int start = 0 ;
        int end = arr.length;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }

        }
        return start;
    }

    static int orderagnostic(int []arr, int target, int start , int end) {
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


}

