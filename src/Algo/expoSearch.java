package Algo;

import java.util.Scanner;

public class expoSearch {
    public static void main(String ar[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();     //array length

        int[] arr = new int[n];

        for(int i = 0;i<n;i++) arr[i]=in.nextInt();   //sorted array

        int key = in.nextInt();   //which needs to be searched

        int val = interpol(arr, 0, n-1, key);
        System.out.println(val);
    }
}
