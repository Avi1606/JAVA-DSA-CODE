package com.JavaDSA.Recursion;

public class Main {
    public static void main(String[]args){
        //print(1);
//        System.out.println(fibo(7));
//        int []arr = {1,5,9,15,58,67,98};

//        System.out.println(bst (arr,15,0,arr.length-1));
      //  funrev(5);
        reverse(1482);
    }

    static void print(int n){
        if( n ==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static int fibo(int n){
        //base condition
        if (n<2){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
    }

    static int bst(int[] arr , int target , int start , int end){

        if(start >end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
           return bst(arr ,  target , start ,  mid-1);
        }
        return bst(arr, target, mid+1 , end);
    }

    static void funrev(int n){
        if(n==0){
            return ;
        }
        funrev(n-1);
        System.out.println(n);
    }

    static void multi(int n){
        if(n==0){
            return;
        }
        multi(n-1);
        

    }

    static int sum(int n){
        if(n==0){
            return n;
        }
        return n%10 +sum (n%10);
    }

    static int reverse(int n ){
        if(n==0){
            return n;
        }
        return (n%10)*10 + reverse(n/10);
    }

   
}
