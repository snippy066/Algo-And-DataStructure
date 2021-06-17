package Algo;
import java.util.*;

public class mergeSort {
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

        div(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void div(int[] arr,int l,int r) {
        if(l<r){
            int m=(l+r)/2;

            div(arr,l,m);
            div(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r){
        
    }
}
