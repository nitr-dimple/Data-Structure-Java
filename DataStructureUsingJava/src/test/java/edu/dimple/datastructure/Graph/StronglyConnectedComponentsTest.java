package edu.dimple.datastructure.Graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class StronglyConnectedComponentsTest {
    @Test
    public void addTest(){
        DAG G = new DirectedGraph(13, 22);
        G.addEdge(0,1);
        G.addEdge(0,5);
        G.addEdge(2,0);
        G.addEdge(2,3);
        G.addEdge(3,2);
        G.addEdge(3,5);
        G.addEdge(4,2);
        G.addEdge(4,3);
        G.addEdge(5,4);
        G.addEdge(6,0);
        G.addEdge(6,4);
        G.addEdge(6,9);
        G.addEdge(6,8);
        G.addEdge(7,6);
        G.addEdge(7,9);
        G.addEdge(8,6);
        G.addEdge(9,10);
        G.addEdge(9,11);
        G.addEdge(10,12);
        G.addEdge(11,4);
        G.addEdge(11,12);
        G.addEdge(12,9);

        StronglyConnectedComponents stronglyConnectedComponents = new StronglyConnectedComponents(G);
        assertEquals(stronglyConnectedComponents.count(), 5);
//        System.out.println(stronglyConnectedComponents.id(0));
//        System.out.println(stronglyConnectedComponents.id(1));
//        System.out.println(stronglyConnectedComponents.id(2));
//        System.out.println(stronglyConnectedComponents.id(3));
//        System.out.println(stronglyConnectedComponents.id(4));
//        System.out.println(stronglyConnectedComponents.id(5));
//        System.out.println(stronglyConnectedComponents.id(6));
//        System.out.println(stronglyConnectedComponents.id(7));
//        System.out.println(stronglyConnectedComponents.id(8));
//        System.out.println(stronglyConnectedComponents.id(9));
//        System.out.println(stronglyConnectedComponents.id(10));
//        System.out.println(stronglyConnectedComponents.id(11));
//        System.out.println(stronglyConnectedComponents.id(12));


        assertEquals(stronglyConnectedComponents.connected(0,2), true);
    }
}
