package edu.dimple.datastructure.Graph;

import edu.dimple.datastructure.UnionFind.PathCompressionWeightedQuickUnion;
import sun.security.rsa.RSAUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class KruskalMST {

    Queue<Edge> queue;
    public KruskalMST(EdgeWeightedGraph G){
        PriorityQueue<Edge> pq = new PriorityQueue<>(G.edges);
        queue = new LinkedList<>();
        PathCompressionWeightedQuickUnion  uf = new PathCompressionWeightedQuickUnion(G.V());
        while(!pq.isEmpty()){
            Edge e = pq.poll();
            int v = e.either();
            int w = e.other(v);

            if(!uf.connected(v,w)){
                uf.union(v,w);
                queue.add(e);
            }
        }

    }
}
