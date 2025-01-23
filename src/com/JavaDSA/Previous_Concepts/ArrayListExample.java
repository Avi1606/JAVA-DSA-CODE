package com.JavaDSA.Previous_Concepts;

import java.util.*;
//import java.util.Scanner;
public class ArrayListExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = "Prajapati";
//        char target = 'P';

        System.out.println("Enter the String you wante to enter: ");
        String stt= sc.nextLine();

        System.out.println("Enter the char which you want to find in string: ");
        char ss = sc.next().charAt(0);

        System.out.println(search(stt, ss));
    }
        static boolean search(String str , char tar){
        if(str.length()==0){
            return false;
        }
            for (int i = 0; i < str.length(); i++) {
                if(tar == str.charAt(i)){
                    return true;
                }
            }
        return false;
        
        
    }
    
}