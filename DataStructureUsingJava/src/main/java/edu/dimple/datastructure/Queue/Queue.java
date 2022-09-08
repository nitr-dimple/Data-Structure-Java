package edu.dimple.datastructure.Queue;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Queue {

    /**
     * Add an element to the queue
     * @param val
     */
    void enqueue(int val);

    /**
     * remove an element from the front of the queue
     * @return
     */
    int dequeue();

    /**
     * return true if queue is empty
     * @return
     */
    boolean isEmpty();

}
