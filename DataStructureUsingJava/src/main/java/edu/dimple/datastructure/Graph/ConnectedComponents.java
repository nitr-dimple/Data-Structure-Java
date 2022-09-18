package edu.dimple.datastructure.Graph;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ConnectedComponents {
    private boolean visited[];
    private int count;
    private int id[];

    public ConnectedComponents(Graph G) {
        visited = new boolean[G.V()];
        count = 0;
        id = new int[G.V()];

        for(int i = 0; i<G.V(); i++){
            if(!visited[i]){
                dfs(G, i);
                count++;
            }
        }
    }

    private void dfs(Graph G, int v) {
        visited[v] = true;
        id[v] = count;
        for(int w: G.adj(v)){
            if(!visited[w])
                dfs(G,w);
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
