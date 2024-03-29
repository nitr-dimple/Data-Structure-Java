package edu.dimple.datastructure.Graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class UndirectedGraphTest {

    @Test
    public void addTest(){
        Graph G = new UndirectedGraph(6, 6);
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(1,3);
        G.addEdge(2,4);
        G.addEdge(3,4);
        G.addEdge(4,5);
        DepthFirstSearch dfs = new DepthFirstSearch(G, 0);
    }
}
