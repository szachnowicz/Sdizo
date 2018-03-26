package com.szachnnowicz.BTree;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
    BinaryTree<Integer> binaryTree;


    @Before
    public void setUp() throws Exception {
        binaryTree = new BinaryTree<>();
    }

    @Test
    public void addToBinnary() throws Exception {

        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);
        System.out.println(binaryTree.containsNode(9));

    }


}