package edu.dimple.datastructure.Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BreadthFirstSearch {
    private boolean visited[];
    private Queue<Integer> queue;

    /**
     * Breadth First Search Traversal of Graph
     * @param G
     * @param s
     */
    public BreadthFirstSearch(Graph G, int s) {
        visited = new boolean[G.V()];
        queue = new LinkedList<Integer>();

        queue.add(s);
        visited[s] = true;

        while(!queue.isEmpty()){
            int v = queue.poll();
            System.out.print(v + " ");
            for(int w : G.adj(v)){
                if(!visited[w]){
                    queue.add(w);
                    visited[w] = true;
                }
            }
        }

        System.out.println();

    }
}
