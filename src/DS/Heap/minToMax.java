//package DS.Heap;
//convert max to min heap

import java.util.Arrays;
import java.util.Scanner;

public class minToMax {

    private int leftch(int i){
        return 2*i+1;
    }
    private int rightch(int i){
        return 2*i+2;
    }
    public static void main(String ar[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        minToMax mm=new minToMax();
        mm.maxHeap(arr);

        System.out.println(Arrays.toString(arr));
    }

    void maxHeap(int[] arr){
        int i=(arr.length-2)/2;
        while(i>=0)
            heapify(arr,arr.length,i--);
    }

    void heapify(int[] arr,int size,int i){
        int left=leftch(i);
        int right=rightch(i);

        int smallest=i;

        if(left<size && arr[left]<arr[smallest]){
            smallest=left;
        }
        if(right<size && arr[right]<arr[smallest]){
            smallest=right;
        }

        if(smallest!=i){
            swap(arr,i,smallest);
            heapify(arr,size,smallest);
        }
    }

    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
