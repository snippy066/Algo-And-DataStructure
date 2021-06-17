import java.util.*;

public class sorting {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=in.nextInt();
        selectionSort(arr);
        System.out.println(sb);
    }

    public static void selectionSort(int [] arr){

    }
}

