package edu.dimple.datastructure.Graph;

/**
 * @author Dimpleben Kanjibhai Patel
 */

import java.util.Stack;

/**
 * Using Kosaraju Sharir algorithm
 * Divided into 2 parts
 * 1. run DFS on reverse Graph and compute reserves postorder (topological sort of reverse graph)
 * 2. run DFS on G, considering vertices in order given by step 1
 */
public class StronglyConnectedComponents {
    private boolean visited[];
    private int count;
    private int id[];
    private Stack<Integer> reversePostOrder;


    public StronglyConnectedComponents(DAG G) {
        visited = new boolean[G.V()];
        count = 0;
        id = new int[G.V()];
        reversePostOrder = new Stack<>();
        Graph Gr = G.reverseGraph();

        for(int i = 0; i< Gr.V(); i++){
            if(!visited[i]){
                dfs(Gr, i);
            }
        }

        for(int i=0; i< visited.length; i++)
            visited[i] = false;

        while(!reversePostOrder.empty()){
            int v = reversePostOrder.pop();

            if(!visited[v]){
                dfsOnTopologicalSort(G,v);
                count++;
            }

        }

    }

    private void dfs(Graph G, int v) {
        visited[v] = true;
        for(int w: G.adj(v)){
            if(!visited[w]){
                dfs(G,w);
            }
        }
        reversePostOrder.push(v);
    }

    private void dfsOnTopologicalSort(Graph G, int v) {
        visited[v] = true;
        id[v] = count;
        for(int w: G.adj(v)){
            if(!visited[w])
                dfsOnTopologicalSort(G,w);
        }
    }

    public int count(){ return count;}

    public int id(int v){
        return id[v];
    }

    public boolean connected(int v, int w){
        return id[v] == id(w);
    }
}
