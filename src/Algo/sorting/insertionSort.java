package Algo.sorting;
import java.util.*;

public class insertionSort {
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

        sortAsc(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortAsc(int[] arr,int siz){
        for(int i=0;i<siz;i++){
            int swap=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>swap){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=swap;
        }
    }
}
