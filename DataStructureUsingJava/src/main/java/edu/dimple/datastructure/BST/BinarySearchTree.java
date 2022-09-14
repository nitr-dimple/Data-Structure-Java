package edu.dimple.datastructure.BST;

import edu.dimple.datastructure.NodeStructure.Tree;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BinarySearchTree {
    Tree root;

    public BinarySearchTree(){
        root = null;
    }

    public void put(int val){
        this.root = put(this.root, val);
    }

    public Tree put(Tree temp, int val){
        if(temp == null) return new Tree(val);
        if(val < temp.val) temp.left = put(temp.left, val);
        else if(val> temp.val) temp.right = put(temp.right, val);
        return temp;
    }

    public void delete(int val){
        this.root = delete(root, val);
    }

    private Tree delete(Tree temp, int val) {
        if(temp != null){
            if(val < temp.val) temp.left = delete(temp.left, val);
            else if(val > temp.val) temp.right = delete(temp.right, val);
            else {
                if(temp.left == null) return temp.right;
                else if(temp.right == null) return temp.left;
                else{
                    Tree p = getMin(temp.right);
                    temp.val = p.val;
                    temp.right = delete(temp.right, p.val);
                }
            }
        }
        return temp;
    }

    public Tree getMin(Tree temp){
        while(temp != null && temp.left != null) temp = temp.left;
        return temp;
    }

    public Tree getRoot(){
        return this.root;
    }

    public void inorder(Tree temp) {
        if(temp != null){
            inorder(temp.left);
            System.out.print(temp.val + " ");
            inorder(temp.right);
        }
    }

    public boolean isEmpty(){  return root == null;}
}
