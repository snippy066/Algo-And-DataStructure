package DS.arrays;

import java.util.Collection;
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
        PriorityQueue<Integer> sml=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> grt=new PriorityQueue<>();
        
    }
}
