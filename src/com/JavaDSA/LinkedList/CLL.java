package com.JavaDSA.LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insertFirst(int val){
        Node node  = new Node(val);

        if(head ==null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;


    }

    public void display(){
        Node temp = head;

        do{
            System.out.print(temp.val+"->");
            temp =temp.next;
        }while(temp != head);
        System.out.println("Head");
    }

    public void delete(int val){

    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
