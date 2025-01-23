package com.JavaDSA.LinkedList;

public class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = size;
    }

    public void AddFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if ( tail == null){
            tail = head;
        }
        size++;
    }

    public void AddLast(int value){
        if(tail == null){
            AddFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void Insert(int value , int index){
        if(index == 0 ){
            AddFirst(value);
            return;
        }
        if(index == size){
            AddLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head =head.next;

        if(head == null ){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getnode(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        return val;
    }

   public Node  getnode(int index){
        Node node = head;
       for (int i = 0; i < index; i++) {
           node = node.next;
       }
       return node;
   }

   public int deletbyindex(int index){
        if (index ==  0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = getnode(index-1);
        int val  = prev.next.value;

        prev.next = prev.next.next;

        return val;

   }

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }

    }


}

