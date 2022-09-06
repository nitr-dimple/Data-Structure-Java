package edu.dimple.datastructure.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Stack_LinkedListTest {

    @Test
    public void testStack() throws Exception {
        Stack stack = new Stack_LinkedList();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        int item = stack.pop();
        assertEquals(item, 1);
        stack.push(2);
        System.out.println(stack);
    }
}
