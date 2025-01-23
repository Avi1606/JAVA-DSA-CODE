package com.JavaDSA.LinkedList;

public class DLL {
    Node head;


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head  = node;
    }

    public void insertLast(int val){
        Node node =new Node(val);

        Node last = head;

        if(head == null ){
            node.prev =null;
            head =node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next=node;
        node.prev =last;
        node.next= null;
    }



    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + "->");
            last =temp;
            temp = temp.next;
        }
        System.out.println("End");

        //reverse
//        while(last != null){
//            System.out.print(last.value +"->");
//            last =last.prev;
//        }
//        System.out.println("start");


    }


    private class  Node {
        private int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}


