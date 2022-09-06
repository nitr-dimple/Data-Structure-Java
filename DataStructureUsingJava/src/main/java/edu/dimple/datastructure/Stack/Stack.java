package edu.dimple.datastructure.Stack;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Stack {
    /**
     * Add element to stack
     * @param val
     */
    void push(int val);

    /**
     * Remove elements from stack
     * @return val
     */
    int pop() throws Exception;

    /**
     * Return top element from the stack
     * @return
     */
    int peek();

    /**
     * Check whether stack is empty or not
     * @return
     */
    boolean isEmpty();

}
