package com.JavaDSA.Queue_Stack;


//  in circular we are increasing the pointer linearly(ptr++) bcz if we do this then
//If start_ptr keeps incrementing, it would eventually exceed the array length
//For example, if array length is 5:
//
//start_ptr: 0 → 1 → 2 → 3 → 4 → 5 ❌ (Invalid index!)

public class CircularQueue {
    protected int []data;
    private static final int DEFAULT_SIZE=10;

    int start_ptr =0;
    int end_ptr= 0;
    int size =0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data =new int[size];
    }

    public boolean isFull(){
        return size == data.length; // pointer at last
    }
    private boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end_ptr] = item;
        end_ptr++;
        end_ptr = end_ptr%data.length;
        size++;
        return true;
    }
    public void remove() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot remove from empty queue");
        }

        int remove = data[start_ptr++];
        start_ptr = start_ptr% data.length;
        size--;

    }
    public int Front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[start_ptr];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        int i=0;
        do{
            System.out.println(data[i]+"->");
            i++;
            i=i%data.length;
        }while(i != end_ptr);
        System.out.println("End");
    }
}
