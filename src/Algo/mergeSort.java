package Algo;
import java.util.*;

public class mergeSort {
    public static void main(String ar[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();

        div(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void div(int[] arr,int l,int r) {
        if(l<r){
            int m=(l+r)/2;

            div(arr,l,m);
            div(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r){
        int fir=m-l+1;  //size of first arr[l,m]
        int sec=r-m;    //size of second arr[m+1,r]

        int left[] =new int[fir];
        int right[] =new int[sec];

        for(int i=0;i<fir;i++)  left[i]=arr[l+i];
        for(int i=0;i<sec;i++)  right[i]=arr[m+i+1];

        int k=l,i=0,j=0;
        while(i<fir && j<sec){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<fir){
            arr[k]=left[i];
            i++; k++;
        }
        while(j<sec){
            arr[k]=right[j];
            j++; k++;
        }

    }
}
