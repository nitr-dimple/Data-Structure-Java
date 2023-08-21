package edu.dimple.datastructure.Graph;

import java.util.ArrayList;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class EdgeWeightedGraph {

    private final int V;
    private int E;
    ArrayList<ArrayList<Edge>> adj;
    ArrayList<Edge> edges;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = new ArrayList<ArrayList<Edge>>();
        edges = new ArrayList<Edge>();
        for(int v=0; v<V; v++){
            adj.add(new ArrayList<Edge>());
        }
    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);
        adj.get(v).add(e);
        adj.get(w).add(e);
        edges.add(e);
        E++;
    }

    public ArrayList<Edge> adj(int v){
        return adj.get(v);
    }

    public ArrayList<Edge> edges(){ return this.edges;}

    public int V(){ return V;}

    public int E(){ return E;}
}
