package DS.arrays;


import java.util.Scanner;

//sub array maximum sum;
public class subSum {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            getSum(arr, n);
        }
        System.out.println(sb.toString());
    }
    static void getSum(int[] arr,int len){
        int maxSumyt=0,maxSum=Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            maxSumyt+=arr[i];
            maxSum=Math.max(maxSum,maxSumyt);
            if(maxSumyt<0)
                maxSumyt=0;
        }
        sb.append(maxSum+"\n");
    }

}
