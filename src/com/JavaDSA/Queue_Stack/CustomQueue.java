package com.JavaDSA.Queue_Stack;

public class CustomQueue {
    protected int []data;
    private static final int DEFAULT_SIZE=10;

    int ptr =0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data =new int[size];
    }
    public boolean isFull(){
        return ptr == data.length; // pointer at last
    }
    private boolean isEmpty(){
        return ptr == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[ptr] = item; //data[ptr++]=item is same as the written lines
        ptr++;
        return true;
    }

    public void remove() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot remove from empty queue");
        }

        int remove = data[0];

        for (int i = 0; i < ptr; i++) {
            data[i-1] = data[i];
        }
    }

    public void display(){
        for (int i = 0; i < ptr; i++) {

            System.out.println(data[i]);


        }
    }

}
