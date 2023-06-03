package edu.dimple.datastructure.AVL;

import edu.dimple.datastructure.NodeStructure.Tree;

/**
 * @author Dimpleben Kanjibhai Patel
 */

class TreeNode{
    int key;
    int height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.key = val;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

public class BalancedBinarySearchTree {

    TreeNode root;

    public BalancedBinarySearchTree(){
        root = null;
    }

    public int getHeight(TreeNode node){
        if(node != null) return node.height;
        return 0;
    }

    public int getBalanceFactor(TreeNode node){
        if(node != null) return getHeight(node.left) - getHeight(node.right);
        return 0;
    }

    public TreeNode getMinNode(TreeNode node){
        while(node.left != null) node = node.left;
        return node;
    }

    public TreeNode rotateLeft(TreeNode node){
        TreeNode temp = node.right;
        node.right = temp.left;
        temp.left = node;

        node.height = Math.max(getHeight(node.left), getHeight(node.right))  + 1;
        temp.height = Math.max(getHeight(temp.left), getHeight(temp.right)) + 1;

        return temp;
    }

    public TreeNode rotateRight(TreeNode node){

        TreeNode temp =  node.left;
        node.left = temp.right;
        temp.right = node;

        node.height = Math.max(getHeight(node.left), getHeight(node.right))  + 1;
        temp.height = Math.max(getHeight(temp.left), getHeight(temp.right))  + 1;

        return temp;
    }

    public TreeNode insert(TreeNode node, int val){
        if(node == null) return new TreeNode(val);
        else if(val < node.key) node.left = insert(node.left, val);
        else if(val > node.key) node.right = insert(node.right, val);
        else return node;
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        // get balance factor to check tree is balanced or not
        int balanceFactor = getBalanceFactor(node);

        if(balanceFactor > 1 && val < node.left.key) return rotateRight(node);
        if(balanceFactor < -1 && val > node.right.key) return rotateLeft(node);
        if(balanceFactor > 1 && val > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balanceFactor < -1 && val < node.right.key){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public TreeNode delete(TreeNode node, int val){
        if(node == null) return node;
        if(val < node.key) node.left = delete(node.left, val);
        else if(val > node.key) node.right = delete(node.right, val);
        else{
            if(node.left == null) return node.right;
            else if(node.right == null) return node.left;
            else {
                TreeNode temp = getMinNode(node.right);
                node.key = temp.key;
                node.right = delete(node.right, temp.key);
            }
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        System.out.println();
        int balanceFactor = getBalanceFactor(node);

        if(balanceFactor > 1 && getBalanceFactor(node.left) >= 0) return rotateRight(node);
        if(balanceFactor < -1 && getBalanceFactor(node.right) <= 0) return rotateLeft(node);
        if(balanceFactor > 1 && getBalanceFactor(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balanceFactor < -1 && getBalanceFactor(node.right) >0){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;

    }

    public void preorder(TreeNode node){
        if(node != null) {
            System.out.print(node.key + "--> ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(TreeNode node){
        if(node != null) {
            inorder(node.left);
            System.out.print(node.key + "--> ");
            inorder(node.right);
        }
    }


}

