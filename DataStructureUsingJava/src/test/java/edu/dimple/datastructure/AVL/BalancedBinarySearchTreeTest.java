package edu.dimple.datastructure.AVL;

import org.junit.Test;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BalancedBinarySearchTreeTest {

    @Test
    public void insertTest(){
        BalancedBinarySearchTree avl = new BalancedBinarySearchTree();
        avl.root = avl.insert(avl.root, 10);
        avl.root = avl.insert(avl.root, 20);
        avl.root = avl.insert(avl.root, 30);
        avl.root = avl.insert(avl.root, 40);
        avl.root = avl.insert(avl.root, 50);
        avl.root = avl.insert(avl.root, 25);

        System.out.println("Preorder Traversal of Tree");
        avl.preorder(avl.root);
        System.out.println();
        System.out.println("Inorder Traversal of Tree");
        avl.inorder(avl.root);

        avl.root = avl.delete(avl.root, 40);

        System.out.println();
        System.out.println("Preorder Traversal of Tree");
        avl.preorder(avl.root);
        System.out.println();
        System.out.println("Inorder Traversal of Tree");
        avl.inorder(avl.root);

        avl.root = avl.insert(avl.root, 5);
        avl.root = avl.insert(avl.root, 12);
        avl.root = avl.insert(avl.root, 2);

        System.out.println();
        System.out.println("Preorder Traversal of Tree");
        avl.preorder(avl.root);
        System.out.println();
        System.out.println("Inorder Traversal of Tree");
        avl.inorder(avl.root);

        avl.root = avl.delete(avl.root, 10);

        System.out.println();
        System.out.println("Preorder Traversal of Tree");
        avl.preorder(avl.root);
        System.out.println();
        System.out.println("Inorder Traversal of Tree");
        avl.inorder(avl.root);

    }
}
