package edu.dimple.datastructure.Graph;

import java.util.ArrayList;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Graph {
    /**
     * Method to add edges to greaph
     * @param v vertex v
     * @param w vertex w
     */
    public void addEdge(int v, int w);

    /**
     * Method to get all the adjacent vertex to vertex v
     * @param v
     * @return
     */
    public ArrayList<Integer> adj(int v);

    /**
     * Method to get number of vertices
     * @return
     */
    public int V();

    /**
     * Method to get number of Edges;
     * @return
     */
    public int E();

}
