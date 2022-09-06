package edu.dimple.datastructure.Stack;

import edu.dimple.datastructure.LinkedList.LinkedList_Element;
import edu.dimple.datastructure.NodeStructure.LinkedListNode;
import sun.awt.image.ImageWatched;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Stack_LinkedList implements Stack{
    private LinkedList_Element list;

    public Stack_LinkedList() {
        list = new LinkedList_Element();
    }

    @Override
    public void push(int val) {
        list.add(val);
    }

    @Override
    public int pop() throws Exception {
        return list.remove();
    }

    @Override
    public int peek() {
        return list.getHead().val;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
