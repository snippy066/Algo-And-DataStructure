package DS.arrays;

import java.util.Scanner;

public class subArray {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        maxArraySum(arr,n);
    }

    static void maxArraySum(int[] arr,int len){
        int maxhere=0,maxSofar=0;

        for(int i=0;i<len;i++){
            maxhere+=arr[i];

            if(maxSofar<maxhere)
                    maxSofar=maxhere;
            if(maxhere<0)
                maxhere=0;
        }
        System.out.println(maxSofar);
        
    }
}
