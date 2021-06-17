import java.util.*;

public class sorting {
    //private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=in.nextInt();
        selectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int [] arr,int len){
        for(int i=0;i<len-1;i++){
            int val=i;
            for(int j=i+1;j<len;j++){
                if(arr[val]>arr[j])
                    val=j;
            }
            int tem=arr[i];
            arr[i]=arr[val];
            arr[val]=tem;
        }
    }
}

