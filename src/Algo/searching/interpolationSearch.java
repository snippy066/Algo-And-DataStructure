package Algo.searching;
import java.util.*;


public class interpolationSearch {
    public static void main(String ar[]) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();     //array length

    int[] arr = new int[n];

    for(int i = 0;i<n;i++) arr[i]=in.nextInt();   //sorted array

    int key = in.nextInt();   //which needs to be searched

    int val = interpol(arr, 0, n-1, key);
        System.out.println(val);
    }

    public static int interpol(int arr[],int lo,int hi,int k){
        int pos=-1;
        if(lo<=hi && arr[lo]<=k && arr[hi]>=k){
            pos=lo+((hi-lo)/(arr[hi]-arr[lo]))*(k-arr[lo]);

            if(arr[pos]==k)
                return pos+1;
            else if(arr[pos]>k)
                return interpol(arr,lo,pos-1,k);
            return interpol(arr,pos+1,hi,k);
        }
        return -1;
    }
}
