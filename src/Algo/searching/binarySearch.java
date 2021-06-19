package Algo.searching;
import java.util.*;

public class binarySearch {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();     //array length

        int[] arr=new int[n];

        for(int i=0;i<n;i++)  arr[i]=in.nextInt();   //sorted array

        int key=in.nextInt();   //which needs to be searched

        int val=binsrc(arr,0,n-1,key);
        System.out.println(val);
    }

    public static int binsrc(int[] arr,int r,int l,int k){
        if(l>=r){
            int mid=(r+l)/2;
            if(arr[mid]==k)
                return mid+1;
            else if(arr[mid]>k)
                return binsrc(arr,r,mid-1,k);
            return binsrc(arr,mid+1,l,k);
        }
        else
            return -1;
    }
}
