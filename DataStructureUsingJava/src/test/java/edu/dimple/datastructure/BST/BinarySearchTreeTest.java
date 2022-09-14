package edu.dimple.datastructure.BST;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BinarySearchTreeTest {
    @Test
    public void insertTest(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.put(8);
        bst.put(5);
        bst.put(9);
        bst.put(11);
        bst.put(2);
        bst.put(4);
        bst.put(15);
        bst.put(19);
        bst.put(12);
        bst.put(1);
        bst.put(3);
        bst.put(24);
        bst.inorder(bst.getRoot());
        assertEquals(bst.getMin(bst.getRoot()).val, 1);
        bst.delete(15);
        System.out.println();
        bst.inorder(bst.getRoot());
        bst.delete(24);
        System.out.println();
        bst.inorder(bst.getRoot());
        bst.delete(8);
        System.out.println();
        bst.inorder(bst.getRoot());
        bst.delete(1);
        assertEquals(bst.getMin(bst.getRoot()).val, 2);


    }
}
