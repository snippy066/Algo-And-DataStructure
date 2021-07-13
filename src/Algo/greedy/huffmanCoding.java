package Algo.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
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

    static void buildHuff(String[] ch,int[] freq,int len){
        PriorityQueue<HuffmanNode> pq=new PriorityQueue<>(len,new myComparator());
    }
}
class HuffmanNode{
    char c;
    int data;

    HuffmanNode left,right;

}

class myComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y)
    {
        return x.data - y.data;
    }
}
