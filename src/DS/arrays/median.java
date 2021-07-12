package DS.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class median {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        calMedi(arr,n);
    }

    static void calMedi(int[] arr, int len){
        PriorityQueue<Integer> smaller = new PriorityQueue<Integer>();
        PriorityQueue<Integer> grt=new PriorityQueue<>();

        smaller.add(arr[0]);
        System.out.println(arr[0]);

        for(int i=1;i<len;i++){
            int med=arr[i];

        }

    }
}
