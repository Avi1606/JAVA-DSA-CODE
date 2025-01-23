package com.JavaDSA.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

//    public void display () {
//        show(root , "");
//        }
//        private void show(Node node, String indent) {
//        if (node == null){
//            return;
//        }
//        System.out.println(indent + node.value);
//        show(node.left,indent +"\t");
//        show(node.right,indent +"\t");
//    }
    public void prettydisplay(){
        prettydisplay(root, 0); //first we print the root ele. then go to right and put all in stack and at the time of returning print them
    }

    private void prettydisplay(Node node , int level){
        //go to the rightmost of tree (see diagram)
        if(node == null){
            return;
        }
        prettydisplay(node.right , level+1);

        if(level !=0 ){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);

        }else{
            System.out.println(node.value);
        }
        prettydisplay(node.left , level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettydisplay();
    }
}
