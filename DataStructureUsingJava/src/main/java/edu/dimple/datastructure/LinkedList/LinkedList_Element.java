package edu.dimple.datastructure.LinkedList;

import edu.dimple.datastructure.NodeStructure.LinkedListNode;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class LinkedList_Element implements LinkedList {
    private LinkedListNode head;


    public LinkedList_Element() {
        head = null;
    }

    /**
     * Insert a value at the begining of the list
     *
     * @param val
     */
    public void add(int val) {
        LinkedListNode temp = new LinkedListNode(val, head);
        head = temp;
    }

    public void addAtEnd(int val) {
        if (head == null) {
            this.add(val);
            return;
        }
        LinkedListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new LinkedListNode(val, null);
    }

    public void addAtLoc(int loc, int val) throws Exception {
        if (loc == 1) {
            this.add(val);
            return;
        }
        LinkedListNode temp = head, prev = null;
        int count = 1;
        while (temp != null && count != loc) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (count < loc)
            throw new Exception("location is invalid");

        prev.next = new LinkedListNode(val, temp);

    }


    /**
     * Remove the value from the begining of the list
     *
     * @return
     */
    public int remove() throws Exception {
        int val;
        if (head == null) throw new Exception("List is Empty");
        else {
            val = head.val;
            head = head.next;
        }
        return val;
    }

    /**
     * Remove Element from the end of the list
     * @return
     */
    public int removeAtEnd() throws Exception {
        if (head == null) throw new Exception("List is Empty");
        if(head.next == null)
            return remove();
        LinkedListNode temp = head;
        while(temp.next.next != null ) temp = temp.next;
        int val = temp.next.val;
        temp.next = null;
        return val;
    }

    /**
     * Remove Element from particular location
     * @return
     */
    public int removeAtLoc(int loc) throws Exception {
        if (loc == 1)
            return remove();
        LinkedListNode temp = head, prev = null;
        int count = 1;
        while (temp != null && count != loc) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (count < loc)
            throw new Exception("location is invalid");
        int val = temp.val;
        if(temp == null) prev.next = null;
        else
            prev.next = temp.next;
        return val;
    }

    public void reverse(){
        if(head == null || head.next == null) return;
        LinkedListNode temp = head, p , q;
        p = temp.next;
        q = p.next;
        temp.next = null;
        while(q != null){
            p.next = temp;
            temp = p;
            p = q;
            q = q.next;
        }
        p.next = temp;
        head = p;
    }


    /**
     * Method to get the head of the list
     *
     * @return
     */
    @Override
    public LinkedListNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        String s = "";
        if(head == null) return s;
        LinkedListNode temp = head;
        while (temp.next != null) {
            s = s + String.valueOf(temp.val) + "---> ";
            temp = temp.next;
        }
        s = s + String.valueOf(temp.val);
        return s;
    }

}
