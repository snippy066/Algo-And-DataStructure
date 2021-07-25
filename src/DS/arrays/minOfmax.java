package DS.arrays;


import java.util.Arrays;
import java.util.Scanner;

//minmizing the maximum difference between towers
public class minOfmax {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int [] arr=new int[n];

            for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

            Arrays.sort(arr);

            mini(arr,n,k);
         }
        System.out.println(sb.toString());
    }
    static  void mini(int[] arr,int len,int key){
        int min=0,max=0;
        min=arr[0]+key;     max=arr[len-1]-key;
        if(min>max){
            int temp=min;
            min=max;
            max=temp;
        }
        int ans=max-min;
        for(int i=1;i<len-1;i++){
            int add=arr[i]+key;
            int sub=arr[i]-key;

            if(min>=sub && max<=add){

                if(max-sub>=add-min)    min=sub;
                else    max=add;
            }
        }
        sb.append(Math.min(ans,max-min)+"\n");
    }
}
