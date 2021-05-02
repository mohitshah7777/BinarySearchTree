package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinarySearchTreeTest {

    @Test
    public void t(){
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(56);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(70);
        int size = myBinarySearchTree.getSize();
        Assert.assertEquals(3,size);
    }

}