package com.example.datastructure.dataStructure.tree;

import org.junit.jupiter.api.Test;


class BinarySearchTreeTest {

    @Test
    void test() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        for (int i = 0; i < 100; i++) {
            binarySearchTree.add(i);
        }
        System.out.println(binarySearchTree.size());
        for (int i = 0; i < 100; i++) {
            binarySearchTree.remove(i);
        }
        System.out.println(binarySearchTree.size());
    }

}