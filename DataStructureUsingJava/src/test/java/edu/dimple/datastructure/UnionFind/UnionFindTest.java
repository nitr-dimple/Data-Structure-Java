package edu.dimple.datastructure.UnionFind;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * @author Dimpleben Kanjibhai Patel
 */
public class UnionFindTest {

    @Test
    public void quickFindTest(){
        QuickFind quickFind = new QuickFind(5);
        quickFind.union(0,3);
        quickFind.union(1,2);
        assertEquals(quickFind.find(1), quickFind.find(2));
        assertEquals(quickFind.find(0), quickFind.find(3));
        assertEquals(quickFind.connected(1,2), quickFind.connected(0,3) );
    }

    @Test
    public void quickUnionTest(){
        QuickUnion quickFind = new QuickUnion(5);
        quickFind.union(0,3);
        quickFind.union(1,2);
        assertEquals(quickFind.find(1), quickFind.find(2));
        assertEquals(quickFind.find(0), quickFind.find(3));
        assertEquals(quickFind.connected(1,2), quickFind.connected(0,3) );
    }

    @Test
    public void weightedQuickUnionTest(){
        WeightedQuickUnion quickFind = new WeightedQuickUnion(5);
        quickFind.union(0,3);
        quickFind.union(1,2);
        assertEquals(quickFind.find(1), quickFind.find(2));
        assertEquals(quickFind.find(0), quickFind.find(3));
        assertEquals(quickFind.connected(1,2), quickFind.connected(0,3) );
    }

    @Test
    public void pathCompressionWeightedQuickUnionTest(){
        PathCompressionWeightedQuickUnion quickFind = new PathCompressionWeightedQuickUnion(5);
        quickFind.union(0,3);
        quickFind.union(1,2);
        assertEquals(quickFind.find(1), quickFind.find(2));
        assertEquals(quickFind.find(0), quickFind.find(3));
        assertEquals(quickFind.connected(1,2), quickFind.connected(0,3) );
    }
}
