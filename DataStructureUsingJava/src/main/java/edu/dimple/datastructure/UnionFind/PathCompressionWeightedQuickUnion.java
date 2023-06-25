package edu.dimple.datastructure.UnionFind;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class PathCompressionWeightedQuickUnion {

    int parent[];
    int size[];

    public PathCompressionWeightedQuickUnion(int n){
        parent = new int[n];
        size = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
            size[i] = 0;
        }
    }

    public int find(int i){
        while(i != parent[i])
            parent[i] = parent[parent[i]];
            i = parent[i];
        return i;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int pid = parent[p];
        int qid = parent[q];
        if(pid == qid) return;
        if(size[pid] < size[qid]) {
            parent[pid] = qid;
            size[qid] += size[pid];
        }else{
            parent[qid] = pid;
            size[pid] += size[qid];
        }

    }
}
