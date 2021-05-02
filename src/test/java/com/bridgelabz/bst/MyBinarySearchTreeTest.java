package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Test;

public class MyBinarySearchTreeTest {

    @Test
    public void t(){
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(56);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(70);
        myBinarySearchTree.add(22);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(60);
        myBinarySearchTree.add(95);
        myBinarySearchTree.add(11);
        myBinarySearchTree.add(65);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(16);
        myBinarySearchTree.add(63);
        myBinarySearchTree.add(67);
        int size = myBinarySearchTree.getSize();
        Assert.assertEquals(13,size);
    }
}