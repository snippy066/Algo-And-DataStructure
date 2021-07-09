package DS.arrays;

import java.util.Scanner;

// range update using difference array zero base indexing
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
            printArr(arr, d);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    static void initArr(int[] arr1,int[] orArr){
        int len=orArr.length;

        arr1[0]=orArr[0];
        arr1[len]=0;

        for(int i=1;i<len;i++)  arr1[i]=orArr[i]-orArr[i-1];
    }

    static void updateArr(int[] arr,int l,int r,int val){
        arr[l]+=val;
        arr[r+1]-=val;

    }

    static void printArr(int[] arr,int[] dif){
        arr[0]=dif[0];
        sb.append(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            arr[i]=dif[i]+arr[i-1];
            sb.append(arr[i]+" ");
        }

    }
}
