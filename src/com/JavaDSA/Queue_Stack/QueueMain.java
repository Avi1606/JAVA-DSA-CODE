package com.JavaDSA.Queue_Stack;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue list = new CustomQueue();

        list.insert(3);
        list.insert(33);
        list.insert(13);
        list.insert(23);
        list.insert(43);
        list.insert(83);

        list.display();

    }
}
