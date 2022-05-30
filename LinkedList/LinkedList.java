package LinkedList;

import java.util.Scanner;

/**
 * @author Dimpleben Kanjibhai Patel
 * Functions in this file -
 * Create linked list
 * Display linked list
 * Add Element At begining
 * Add element at end
 * Add element at particular location
 * Delete node from begining
 * Delete node from end
 * Delete node from particular location
 * Reverse linked list
 * Search element in linked list
 */

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    public static void main(String args[]) {
        Node head = null;
//      Creating Linked List
        System.out.println("Creating linklist");
        head = createList(head, 1);
        head = createList(head, 10);
        head = createList(head, 20);
        head = createList(head, 30);
        head = createList(head, 40);

//      Display Linked list
        System.out.println("Displaying Linked List");
        displayList(head);

//        Adding element at begining
        System.out.println("Adding Element at begining");
        head = addAtBegining(head, 5);
        displayList(head);

//        Adding element at end
        System.out.println("Adding Element at End");
        head = addAtEnd(head, 25);
        displayList(head);

//        Add element at perticular location
        int loc = 8;
        int val = 100;
        System.out.println("Adding Element at location : " + loc);
        head = addAtLoc(head, val, loc);
        displayList(head);

//        Delete node from begining
        System.out.println("Delete Node at begining");
        head = deleteAtBegining(head);
        displayList(head);

//        Delete node at end
        System.out.println("Delete Node at end");
        head = deleteAtEnd(head);
        displayList(head);

//        Delete node at particular location
        loc = 7;
        System.out.println("Delete Node at loc: " + loc);
        head = deleteAtLocation(head, loc);
        displayList(head);

//        Reverse a linked list
        System.out.println("Reversing linked list");
        head = reverseLinkedList(head);
        displayList(head);

//       Search an element in linked list
        val = 1;
        System.out.println("Search given element in linked list: " + val);
        searchElement(head, val);


    }

    //    Function to create Linked List
    public static Node createList(Node head, int val) {
        Node temp;
        if (head == null) {
            temp = new Node(val);
            temp.next = null;
            head = temp;
        } else {
            temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(val);
            temp = temp.next;
            temp.next = null;
        }
        return head;
    }

    //    Function to display linked list
    public static void displayList(Node head) {
        Node temp = head;
        if (temp == null)
            System.out.println("List is empty");
        else {
            while (temp.next != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
        System.out.println();
    }

    //    function to add element at begining
    public static Node addAtBegining(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
    }

    //    function to add element at end
    public static Node addAtEnd(Node head, int val) {
        Node temp = head;
        if (head == null) {
            temp = new Node(val);
            temp.next = head;
            head = temp;
        } else {
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(val);
            temp = temp.next;
            temp.next = null;
        }
        return head;
    }

    //    function to add element at particular location
    public static Node addAtLoc(Node head, int val, int loc) {
        int length = 1;
        Node temp = head;
        Node prev = head;
        if (loc < length)
            System.out.println("Please enter correct location");
        if (loc == 1)
            return addAtBegining(head, val);
        else {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
                length++;
                if (length == loc) {
                    prev.next = new Node(val);
                    prev = prev.next;
                    prev.next = temp;
                    break;
                }
            }
        }
        if (loc == length + 1) {
            temp.next = new Node(val);
            temp = temp.next;
            temp.next = null;
        }
        if (loc > length + 1) {
            System.out.println("Please enter valid location");
        }
        return head;
    }

    //    function to delete element at the begining
    public static Node deleteAtBegining(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    //    Deleting the node at the end
    public static Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }

    //    Deleting the node at given location
    public static Node deleteAtLocation(Node head, int loc) {
        int length = 1;
        Node temp = head;
        Node prev = head;
        if (loc < length)
            System.out.println("Please enter correct location");
        if (loc == 1)
            return deleteAtBegining(head);
        else {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
                length++;
                if (length == loc) {
                    prev.next = temp.next;
                    break;
                }
            }
        }
        if (loc > length) {
            System.out.println("Please enter valid location");
        }
        return head;
    }

    //    function to reverse linked list
    public static Node reverseLinkedList(Node head) {
        Node p, q, temp = head;
        if (head == null || head.next == null) return head;
        p = temp.next;
        q = p.next;
        temp.next = null;
        while (q != null) {
            p.next = temp;
            temp = p;
            p = q;
            q = q.next;
        }
        p.next = temp;
        return p;
    }

//    function to search an element in given linked list
    public static void searchElement(Node head, int val) {
        Node temp = head;
        int loc = 1;
        while(temp != null){
                if(temp.data == val) {
                    System.out.println("Element is present at location: " + loc  + " in the list");
                    return;
                }
                loc++;
                temp = temp.next;
        }
        if(temp == null){
            System.out.println("Element not Found");
            return;
        }

    }
}
