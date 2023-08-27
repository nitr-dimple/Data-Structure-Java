package edu.dimple.datastructure.Graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class PrimsMST {

    Queue<Edge> mst;
    boolean visited[];
    PriorityQueue<Edge> pq;

    public PrimsMST(EdgeWeightedGraph G){
        pq = new PriorityQueue<>();
        mst = new LinkedList<>();
        visited = new boolean[G.V()];

        visit(G, 0);
        while(!pq.isEmpty() && mst.size() < G.V() - 1){
            Edge e = pq.poll();
            int v = e.either();
            int w = e.other(v);
            if(visited[v] && visited[w]) continue;
            mst.add(e);
            if(!visited[v]) visit(G, v);
            if(!visited[w]) visit(G, w);
        }

    }

    public void visit(EdgeWeightedGraph G, int v){
        visited[v] = true;
        for(Edge e: G.adj(v)){
            if(!visited[e.other(v)])
                pq.add(e);
        }


    }
}
