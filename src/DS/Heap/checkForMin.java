//package DS.Heap;
//check if the given array is minimum heap or not

import java.util.Scanner;

public class checkForMin {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        if(checkHeap(arr))  System.out.println("Minimum heap");
        else System.out.println("not minimum heap");
    }

    static boolean checkHeap(int[] arr){
        for(int i=0;i<=(arr.length-2)/2;i++){
            if(arr[i]>arr[2*i+1] || ((2*i+2!=arr.length && arr[i]>arr[2*i+2])))
                return false;
        }
        return true;
    }
}
