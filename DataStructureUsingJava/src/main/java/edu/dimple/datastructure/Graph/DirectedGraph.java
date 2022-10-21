package edu.dimple.datastructure.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class DirectedGraph implements DAG{
    private int V;
    private int E;
    private ArrayList<ArrayList<Integer>> adj;


    public DirectedGraph(int v, int e){
        V = v;
        E = e;
        adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i = 0; i< V; i++)
            adj.add(new ArrayList<Integer>());

    }

    public Graph reverseGraph(){
        DirectedGraph reverseGraph = new DirectedGraph(this.V(), this.E());
        for(int v = 0; v < V; v++){
            for(int w : adj(v)){
                reverseGraph.addEdge(w, v);
            }
        }
        return reverseGraph;
    }

    public void addEdge(int v, int w){
        adj.get(v).add(w);
    }

    public ArrayList<Integer> adj(int v){
        return adj.get(v);
    }

    public int V(){
        return this.V;
    }

    public int E(){
        return this.E;
    }
}
