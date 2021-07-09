package DS.arrays;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class differenceRangeUpd {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        int[] d=new int[n+1]; //difference array

        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();
        int t=sc.nextInt();

        initArr(d,arr);
        while(t-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int val = sc.nextInt();

            updateArr(d, l, r, val);
            sb.append("\n");
        }

    }
    static void initArr(int[] arr1,int[] orArr){
           
    }
    static void updateArr(int[] arr,int l,int r,int val){

    }
}
