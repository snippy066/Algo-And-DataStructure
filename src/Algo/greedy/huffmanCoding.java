package Algo.greedy;

import java.util.Scanner;

public class huffmanCoding {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        String[] ch=sc.nextLine().split(" ");

        int[] freq=new int[n];
        for(int i=0;i<n;i++)  freq[i]=sc.nextInt();

        buildHuff(ch,freq,n);
    }
}
