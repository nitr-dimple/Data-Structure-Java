package edu.dimple.datastructure.Graph;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dimpleben Kanjibhai Patel
 */

/**
 * Graph representation using adjacency lists -
 * space complexity : E + V
 * add Edge: 1
 * edge between v and w : degree(v)
 * iterate over vertices adjacent to v : degree(v)
 */
public class UndirectedGraph implements Graph{
    private int V;
    private int E;
    private ArrayList<ArrayList<Integer>> adj;


    public UndirectedGraph(int v, int e){
        V = v;
        E = e;
        adj = new ArrayList<ArrayList<Integer>>(V);
        for(int i = 0; i< V; i++)
            adj.add(new ArrayList<Integer>());
    }

    public void addEdge(int v, int w){
        adj.get(v).add(w);
        adj.get(w).add(v);
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

    public int degree(int v){
        int degree = 0;
        for(int w : adj(v))
            degree++;
        return degree;
    }
}
