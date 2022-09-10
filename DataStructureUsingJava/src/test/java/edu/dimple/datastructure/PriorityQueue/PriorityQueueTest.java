package edu.dimple.datastructure.PriorityQueue;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class PriorityQueueTest {
    @Test
    public void testMin() throws Exception {

        PriorityQueue pq = new PriorityQueue(5);
        pq.insert(3);
        pq.insert(7);
        pq.insert(2);
        pq.insert(9);
        pq.insert(1);

        assertEquals(1, pq.remove());
        assertEquals(2,pq.remove());
        pq.insert(-1);
        assertEquals(-1,pq.remove());
    }

    @Test
    public void testMax() throws Exception {

        PriorityQueue pq = new PriorityQueue(5, true);
        pq.insert(3);
        pq.insert(7);
        pq.insert(2);
        pq.insert(9);
        pq.insert(1);

        assertEquals(9, pq.remove());
        assertEquals(7,pq.remove());
        pq.insert(10);
        assertEquals(10,pq.remove());
    }
}
