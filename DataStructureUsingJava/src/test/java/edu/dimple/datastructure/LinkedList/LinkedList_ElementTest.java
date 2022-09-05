package edu.dimple.datastructure.LinkedList;


/**
 * @author Dimpleben Kanjibhai Patel
 */

import org.junit.Test;
import  static org.junit.Assert.*;

public class LinkedList_ElementTest {

    @Test
    public void testLinkedlistAdd(){
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.getHead().val);
        System.out.println(list);
    }

    @Test
    public void testLinkedlistAddAtEnd(){
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAtEnd(4);
        assertEquals(3, list.getHead().val);
        System.out.println(list);
    }

    @Test
    public void testLinkedlistAddAtLoc() throws Exception {
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAtEnd(4);
        list.addAtLoc(5, 6);
        assertEquals(3, list.getHead().val);
        System.out.println(list);
    }

    @Test
    public void testLinkedlistRemove() throws Exception {
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove();
        assertEquals(3, list.getHead().val);
        System.out.println(list);
    }

    @Test
    public void testLinkedlistRemoveAtEnd() throws Exception {
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.removeAtEnd();
        assertEquals(3, list.getHead().val);
        System.out.println(list);
    }

    @Test
    public void testLinkedlistRemoveAtLoc() throws Exception {
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.removeAtLoc(2);
        System.out.println(list);
        assertEquals(4, list.getHead().val);

    }

    @Test
    public void testLinkedlistReverse() throws Exception {
        LinkedList_Element list = new LinkedList_Element();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        assertEquals(1, list.getHead().val);
    }

}
