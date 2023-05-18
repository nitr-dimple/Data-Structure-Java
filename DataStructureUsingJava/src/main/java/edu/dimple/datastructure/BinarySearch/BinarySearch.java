package edu.dimple.datastructure.BinarySearch;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BinarySearch {

    public static int binarySearch(int a[], int low, int high, int key){
        while(low <= high){
            int mid = low + (high-low)/2;
            if(a[mid] == key)
                return mid;
            else if(a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result1 = binarySearch(arr, 0, arr.length, 4);
        System.out.println(result1);
        int result2 = binarySearch(arr, 0, arr.length, 3);
        System.out.println(result2);
        int result3 = binarySearch(arr, 0, arr.length, -1);
        System.out.println(result3);
    }
}
