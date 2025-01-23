package com.JavaDSA.Queue_Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);

        stack.push(12);
        stack.push(22);
        stack.push(51);
        stack.push(55);
        stack.push(120);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
