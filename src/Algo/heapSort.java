package Algo;

import java.util.Arrays;
import java.util.Scanner;

public class heapSort {
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

        sortAsc(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortAsc(int[] arr, int siz){
        for(int i=siz/2-1;i>=0;i--)
            heapy(arr,siz,i);

        for(int i=siz-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapy(arr,i,0);
        }
    }

    public static void heapy(int[] arr,int n,int c){
        int lar=c;
        int left=2*c+1;
        int right=2*c+2;

        if(left<n && arr[left]>arr[lar])
            lar=left;
        if(right<n && arr[right]>arr[lar])  lar=right;

        if(lar!=c){
            int temp=arr[c];
            arr[c]=arr[lar];
            arr[lar]=temp;

            heapy(arr,n,lar);

        }

    }
}
