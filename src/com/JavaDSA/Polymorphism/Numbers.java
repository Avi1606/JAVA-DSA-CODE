package com.JavaDSA.Polymorphism;

public class Numbers {

    int sum (int a , int b , int c){
        return a+b+c;
    }

    int sum(int a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers num1 = new Numbers();
        System.out.println(num1.sum(5,6,7));
        System.out.println(num1.sum(5,6));
    }
}
