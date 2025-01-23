package com.JavaDSA.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);
        tree.display();
    }
}
