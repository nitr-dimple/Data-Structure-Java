package edu.dimple.datastructure.RedBlackTree;

import org.junit.Test;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class RedBlackTreeTest {

    @Test
    public void insertTest(){
        RedBlackTree rbt = new RedBlackTree();
        rbt.insert(3);
        rbt.insert(21);
        rbt.inorder();
        rbt.insert(32);
        rbt.inorder();
        rbt.insert(15);;
        rbt.inorder();
        rbt.insert(16);;
        rbt.inorder();
        rbt.insert(2);;
        rbt.inorder();
        rbt.insert(1);;
        rbt.inorder();
    }
}
