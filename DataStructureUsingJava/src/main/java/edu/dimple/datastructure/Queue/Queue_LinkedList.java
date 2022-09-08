package edu.dimple.datastructure.Queue;

import edu.dimple.datastructure.NodeStructure.LinkedListNode;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Queue_LinkedList implements Queue{
    LinkedListNode front;
    LinkedListNode rear;

    public Queue_LinkedList() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enqueue(int val) {
        if(isEmpty()){
            front = rear = new LinkedListNode(val);
        }
        else{
            rear.next = new LinkedListNode(val);
            rear = rear.next;
        }
    }

    @Override
    public int dequeue() {
        if(isEmpty()) return -1;
        int val = front.val;
        if(front == rear) rear = rear.next;
        front = front.next;
        return val;
    }

    @Override
    public boolean isEmpty() {
        return front == null && rear == null;
    }




}
