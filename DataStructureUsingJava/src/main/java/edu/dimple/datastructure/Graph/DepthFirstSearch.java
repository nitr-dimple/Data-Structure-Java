package edu.dimple.datastructure.Graph;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class DepthFirstSearch {
    private boolean visited[];

    /**
     * Constructor for DFS traversal from vertex s
     * @param G
     * @param s
     */
    public DepthFirstSearch(Graph G, int s){
        visited = new boolean[G.V()];
        DFS(G, s);
    }

    public void DFS(Graph G, int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int w: G.adj(v)){
            if(!visited[w] ) DFS(G, w);
        }
    }
}
