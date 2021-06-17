package Algo;
import java.util.*;

public class mergeSort {
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

        sortAsc(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortAsc(int[] arr,int siz) {

    }
}
