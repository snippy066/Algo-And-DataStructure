//fibonacci problem solution using tabulation and memoization
package Algo.DP;

import java.util.Scanner;

public class fibonacci {
    private static StringBuilder sb=new StringBuilder();
    private static int fib[] =new int[1000];
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int num=in.nextInt();
        int ch=in.nextInt();    //choice 1- tabulation any_other : memoi

        int val=0;
        if(ch==1)
           val=tab(num);
        else
            val=memo(num);

        System.out.print(val);
    }

    static int tab(int n){
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++)
            fib[i]=fib[i-1]+fib[i-2];
        return fib[n];
    }

    static int memo(int n){
        if(fib[n]==0){
            if(n<=1)
                fib[n]=n;
            else
                fib[n]=memo(n-1)+memo(n-2);
        }
        return fib[n];
    }
}
