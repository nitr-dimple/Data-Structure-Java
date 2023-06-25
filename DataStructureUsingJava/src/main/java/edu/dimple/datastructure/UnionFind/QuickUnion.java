package edu.dimple.datastructure.UnionFind;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class QuickUnion {
    int parent[];

    public QuickUnion(int n){
        parent = new int[n];
        for(int i=0; i<n; i++)
            parent[i] = i;
    }

    public int find(int i){
        while(i != parent[i])
            i = parent[i];
        return i;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int pid = parent[p];
        int qid = parent[q];
        parent[p] = q;

    }
}
