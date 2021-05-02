package com.bridgelabz.bst;

public class MyBinarySearchTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
        if(current == null){
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(MyBinaryNode<K> root) {
        return root == null ? 0 : 1 + this.getSizeRecursively(root.left) + this.getSizeRecursively(root.right);
    }
}