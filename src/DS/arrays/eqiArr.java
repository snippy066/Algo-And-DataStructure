//to find the equilibrim index of the array where left sum is equal to right sum;

package DS.arrays;


import java.util.Scanner;

public class eqiArr {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        int index=equilib(arr,n);
    }

    static int equilib(int[] arr,int len){
        if(len==1)
            return 0;

        int[] front=new int[len];   //for front prefix array
        int[] back=new int[len];    //for backward prefix array

        front[0]=arr[0];
        back[len-1]=arr[len-1];

        for(int i=1;i<len;i++){
            front[i]=front[i-1]+arr[i];
            back[len-i-1]=back[len-1]+arr[len-i-1];
        }

        for(int i=0;i<len;i++){
            if(back[i]==front[i])
                return i;
        }
        return -1;
    }
}
