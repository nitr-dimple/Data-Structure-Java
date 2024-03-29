package edu.dimple.datastructure.Graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class DirectedGraphTest {
    @Test
    public void addTest(){
        DAG G = new DirectedGraph(6, 6);
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(1,3);
        G.addEdge(2,4);
        G.addEdge(3,4);
        G.addEdge(4,5);
        DepthFirstSearch dfs = new DepthFirstSearch(G, 0);
        BreadthFirstSearch bfs = new BreadthFirstSearch(G, 0);

        DepthFirstSearch dfs1 = new DepthFirstSearch(G.reverseGraph(), 5);
    }
}
