package DS.advanceDs;

import java.util.Scanner;

//binary indexed tree or fenwick tree implementation zero based indexing 
public class binIndex {
    private static int max= 100;    //maximum length of integer can be used
    private static int[] bi=new int[max];
    private static StringBuilder sb=new StringBuilder();
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)  arr[i]=sc.nextInt();
        int sumInd=sc.nextInt();
        int updInd=sc.nextInt();
        int updVal=sc.nextInt();


        constBintr(arr);

       getSum(sumInd);

       updateBintr(updInd,n,updVal);

       getSum(sumInd);

       System.out.println(sb.toString());
    }

    static void constBintr(int[] arr){
        int len=arr.length;

        for(int i=0;i<len;i++)
            updateBintr(i,len,arr[i]);
    }

    static void updateBintr(int ind,int length,int value){
        ind++;

        while(ind<=length){
            bi[ind]+=value;

            ind+=ind &(-ind);
        }
    }

    static void getSum(int index){
        int sum=0;
        index++;
        while(index>0){
            sum+=bi[index];

            index-=index & (-index);
        }
        sb.append(sum+" ");
    }

}
