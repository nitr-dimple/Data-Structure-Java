package edu.dimple.datastructure.UnionFind;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class QuickFind {
    int id[];

    public QuickFind(int n){
        id = new int[n];
        for(int i=0; i<n; i++)
            id[i] = i;
    }

    public int find(int p){
        return id[p];
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for(int i=0; i< id.length; i++)
            if(id[i] == pid) id[i] = qid;
    }
}
