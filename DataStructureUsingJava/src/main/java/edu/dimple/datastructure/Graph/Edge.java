package edu.dimple.datastructure.Graph;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Edge implements Comparable<Edge>{

    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        if(v < 0) throw new IllegalArgumentException("Vertex must be non-negative integer");
        if(w < 0) throw new IllegalArgumentException("Vertex must be non-negative integer");
        if(Double.isNaN(weight)) throw new IllegalArgumentException("Weight is NaN");

        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either(){ return v;}

    public int other(int vertex){
        if(vertex == v) return w;
        else if(vertex == w) return v;
        else throw new IllegalArgumentException("Illegal endpoint");
    }

    public double getWeight(){return this.weight;}

    public double weight(){ return weight;}


    @Override
    public int compareTo(Edge that) {
        return Double.compare(this.weight, that.weight);
    }

    public String toString(){
        return String.format("%d----%d  %.5f", v,w,weight);
    }
}
