package edu.dimple.datastructure.Graph;

import org.junit.Test;

import java.util.Queue;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class KruskalMSTTest {

    @Test
    public void KruskalTest(){
        EdgeWeightedGraph edgeWeightedGraph = new EdgeWeightedGraph(4);
        edgeWeightedGraph.addEdge(new Edge(0,1,0.5));
        edgeWeightedGraph.addEdge(new Edge(0,2, 0.2));
        edgeWeightedGraph.addEdge(new Edge(0,3, 0.9));
        edgeWeightedGraph.addEdge(new Edge(1,2, 0.3));
        edgeWeightedGraph.addEdge(new Edge(1,3, 0.7));
        edgeWeightedGraph.addEdge(new Edge(2,3, 0.1));

        KruskalMST kruskalMST = new KruskalMST(edgeWeightedGraph);
        Queue<Edge> queue = kruskalMST.queue;

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
