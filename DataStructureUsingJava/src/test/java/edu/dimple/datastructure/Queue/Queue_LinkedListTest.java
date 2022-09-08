package edu.dimple.datastructure.Queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Queue_LinkedListTest {
    @Test
    public void testQueue0() {
        Queue queue = new Queue_LinkedList();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        int val1 = queue.dequeue();
        int val2 = queue.dequeue();
        assertEquals(val1, 1);
        assertEquals(val2, 2);
        assertTrue(queue.isEmpty());
    }
}
