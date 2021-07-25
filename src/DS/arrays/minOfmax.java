package DS.arrays;


import java.util.Scanner;

//minmizing the maximum difference between towers
public class minOfmax {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();

            int [] arr=new int[n];

            for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

            mini(arr,n);
         }
    }
    static  void mini(int[] arr,int len){
        
    }
}
