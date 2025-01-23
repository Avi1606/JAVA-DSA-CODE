package com.JavaDSA.Heap;

import java.util.ArrayList;

public class heap<T extends Comparable<T>>{

    private ArrayList<T> list;

    public heap(){
        list = new ArrayList<>();
    }

    private void swap(int first ,int second){
        T temp = list.get(first);
        list.set(first , list.get(second));
        list.set(second , temp);
    }

    public int parent(int value){
        return value/2;
    }
    public int right(int value){
        return 2*value +1;
    }
    public int left(int value){
        return 2*value;
    }

    public void insert(T value){
        list.add(value); // adding it at as left last element
        upheap(list.size()); // last vale element ka index
    }

    private void upheap(int index){
        if(index == 0){
            return;
        }

        if(list.get(index).compareTo(list.get(parent(index)))<0){  // index value<parent
            swap(index , parent(index));
            upheap(parent(index));
        }
    }

    public T remove(){
        if(list.isEmpty())
        {
            System.out.println("Empty heap !!");

        }

        T first = list.get(0);
        T last = list.remove(list.size());
        if(!list.isEmpty())
        {
            list.set( 0 , last);
        }
        downheap(0);
        return first;
    }

    private void downheap(int index)
    {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index)
        {
            swap(min,index);
            downheap(min);
        }


    }

}
