package com.JavaDSA.Tries;

public class Main {
    private class Node{
        Node children [] = new Node[26];
        boolean eow = false;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    private Node root = new Node();

    public class Tries{
        Node curr = root;


    }
}
