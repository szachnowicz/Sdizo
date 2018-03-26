package com.szachnnowicz.BTree;

import com.szachnnowicz.IMethods;

public class BinaryTree<T> {

    private Node root;


    private class Node {
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
            left = null;
            right = null;
        }

    }

    private Node addRecursive(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }


        if ((Integer) value < (Integer) current.value) {
            current.left = addRecursive(current.left, value);
        } else if ((Integer) value > (Integer) current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public boolean containsNode(T value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, T value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return (Integer) value < (Integer) current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }
    public void add(T value) {
        root = addRecursive(root, value);
    }

    private Node deleteRecursive(Node current, T value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if ((Integer) value < (Integer) current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

}
