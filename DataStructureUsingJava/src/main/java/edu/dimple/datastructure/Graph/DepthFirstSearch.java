package edu.dimple.datastructure.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class DepthFirstSearch {
    private boolean visited[];
    private ArrayList<Integer> dfsOrder;
    private Stack<Integer> reversePostOrder;

    /**
     * Constructor for DFS traversal from vertex s
     * @param G
     * @param s
     */
    public DepthFirstSearch(Graph G, int s){
        visited = new boolean[G.V()];
        dfsOrder = new ArrayList<>();
        reversePostOrder = new Stack<>();
        DFS(G, s);
        System.out.println();
    }

    public void DFS(Graph G, int v){
        visited[v] = true;
        dfsOrder.add(v);
        System.out.print(v + " ");
        for(int w: G.adj(v)){
            if(!visited[w] ) DFS(G, w);
        }
        reversePostOrder.push(v);

    }

    public Stack<Integer> getReversePostOrder(){
        return reversePostOrder;
    }
}
