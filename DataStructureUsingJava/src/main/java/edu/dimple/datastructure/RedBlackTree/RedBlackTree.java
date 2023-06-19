package edu.dimple.datastructure.RedBlackTree;

/**
 * @author Dimpleben Kanjibhai Patel
 */

class Node{
    int val;
    Node left;
    Node right;
    Node parent;
    char color;

    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.color = 'R';
    }
}

public class RedBlackTree {

    public Node root;

    public RedBlackTree(){
        this.root = null;
    }

    // Left Rotation
    Node rotateLeft(Node node){
        Node temp = node.right.left;
        Node t2 = node.right;
        node.right.left = node;
        node.right = temp;
        node.parent = t2;
        if(temp != null)
            temp.parent = node;
        return t2;
    }

    // Right Rotation
    Node rotateRight(Node node){
        Node temp = node.left.right;
        Node t2 = node.left;
        node.left.right = node;
        node.left = temp;
        node.parent = t2;
        if(temp != null)
            temp.parent  = node;
        return t2;
    }

    boolean ll = false;
    boolean lr = false;
    boolean rr = false;
    boolean rl = false;

    Node insertHelp(Node root, int val){

        // redFlag is true when node and parent both are red
        boolean redFlag = false;

        if(root == null)
            return new Node(val);
        else if(val < root.val){
            root.left = insertHelp(root.left, val);
            root.left.parent = root;
            if(root != this.root){
                if(root.color == 'R' && root.left.color == 'R')
                    redFlag = true;
            }
        }
        else if(val > root.val){
            root.right = insertHelp(root.right, val);
            root.right.parent = root;
            if(root != this.root){
                if(root.color == 'R' && root.right.color == 'R')
                    redFlag = true;
            }
        }

        if(this.ll){
            root = rotateLeft(root);
            root.color = 'B';
            root.left.color = 'R';
            this.ll = false;
        }

        if(this.lr){
            root.left = rotateLeft(root.left);
            root.left.parent = root;
            root = rotateRight(root);
            root.color = 'B';
            root.right.color = 'R';
            this.lr = false;
        }

        if(this.rl){
            root.right = rotateRight(root.right);
            root.right.parent = root;
            root = rotateLeft(root);
            root.color = 'B';
            root.left.color = 'R';
            this.rl = false;
        }

        if(this.rr){
            root = rotateRight(root);
            root.color = 'B';;
            root.right.color = 'R';
            this.rr = false;
        }

        if(redFlag){
            // if the node is right node
            if(root.parent.right == root){
                // If uncle color is black
                if(root.parent.left == null || root.parent.left.color == 'B'){
                    // Checking which rotation
                    if(root.left != null && root.left.color == 'R')
                        this.rl = true;
                    else if(root.right != null & root.right.color == 'R')
                        this.ll = true;
                }else{                          // If uncle is red, simply change ths color
                    root.parent.left.color = 'B';
                    root.color = 'B';
                    if(root.parent != this.root){
                        root.parent.color = 'R';
                    }
                }
            }
            // if the node is left node
            else{
                if(root.parent.right == null || root.parent.right.color == 'B'){
                    if(root.left != null && root.left.color == 'R')
                        this.rr = true;
                    else if(root.right != null && root.right.color == 'R')
                        this.lr = true;
                }
                else{
                    root.parent.right.color = 'B';
                    root.color = 'B';
                    if(root.parent != this.root){
                        root.parent.color = 'R';
                    }
                }
            }

        }
        return root;
    }

    public void insert(int val){
        if(this.root == null){
            this.root = new Node(val);
            this.root.color = 'B';
        }
        else{
            this.root = insertHelp(this.root, val);
        }
    }

    public void inorderTraversal(Node node){
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(" " + node.val + "(" + node.color +")");
            inorderTraversal(node.right);
        }
    }

    public void inorder(){
        inorderTraversal(this.root);
        System.out.println();
    }
}
