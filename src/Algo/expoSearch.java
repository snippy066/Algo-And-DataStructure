package Algo;
import java.util.Arrays;
import java.util.Scanner;

public class expoSearch {
    public static void main(String ar[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();     //array length

        int[] arr = new int[n];

        for(int i = 0;i<n;i++) arr[i]=in.nextInt();   //sorted array

        int key = in.nextInt();   //which needs to be searched

        int val = exposrc(arr,n, key);
        System.out.println(val);
    }

    public static int exposrc(int[] arr,int siz,int k){
        int i=1;
        if(arr[0]==k)
            return i;

        while(i<siz && arr[i]<=k)
            i*=2;

        return Arrays.binarySearch(arr,i/2,Math.min(i,siz-1),k);
    }
}
