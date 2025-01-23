package com.JavaDSA.Queue_Stack;

public class CustomStack {
    protected int data[];
    private static final int DEFAULT_SIZE=10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    int ptr =0;

    public boolean push(int items){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[ptr] = items;
        return true;
    }
    public boolean isFull(){
        return ptr == data.length ; // pointer at last
    }
    private boolean isEmpty(){
        return ptr  == 0;
    }

    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop the empty array");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop the empty array");
        }
        return data[ptr];
    }

}
