package edu.dimple.datastructure.NodeStructure;

import edu.dimple.datastructure.LinkedList.LinkedList;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class LinkedListNode {
    public int val;
    public LinkedListNode next;

    public LinkedListNode() {
    }

    public LinkedListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public LinkedListNode(int val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }
}
