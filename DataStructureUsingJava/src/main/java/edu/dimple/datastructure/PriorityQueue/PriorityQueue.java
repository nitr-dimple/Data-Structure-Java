package edu.dimple.datastructure.PriorityQueue;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class PriorityQueue {
    private final boolean max;
    private int n;
    private int binHeap[];
    private int last;

    public PriorityQueue( int n) {
        this.max = false;
        this.n = n;
        binHeap = new int[n+1];
        last = 0;
    }


    public PriorityQueue( int n, boolean max) {
        this.max = max;
        this.n = n;
        binHeap = new int[n+1];
        last = 0;
    }

    /**
     * Insert an element in the priority queue
     * @param val
     */
    public void insert(int val) throws Exception {
        if(last == n)
            throw  new Exception("Heap if full");
        binHeap[++last] = val;
        swimUp(last);
    }

    private void swimUp(int k) {
        int i = k;
        while(i > 1 && unordered(parent(i), i)){
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public void swap(int i, int j){
        int temp = binHeap[i];
        binHeap[i] = binHeap[j];
        binHeap[j] = temp;
    }

    public int remove() throws Exception{
        if(isEmpty()) throw new Exception("Priority Queue is Empty");
        int result = binHeap[1];
        swap(1, last--);
        sinkDown(1);
        return result;
    }

    private void sinkDown(int k) {
        int i = k;
        while(i*2 <= last){
            int j = i*2;
            if(j < last && unordered(j,j+1)) j++;
            if(!unordered(i,j)) break;
            swap(i,j);
            i = j;
        }
    }

    private boolean unordered(int j, int i) {
        if(this.max)
            return binHeap[j] < binHeap[i];
        else
            return binHeap[j] > binHeap[i];
    }


    private int parent(int k) {
        return k/2;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int getFirst() { return binHeap[1];}

    public int size() {
        return n;
    }

}
