package Algo.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class huffmanCoding {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        String s=sc.nextLine();
        char ch[]=s.toCharArray();

        int[] freq=new int[n];
        for(int i=0;i<n;i++)  freq[i]=sc.nextInt();

        buildHuff(ch,freq,n);
    }

    static void buildHuff(char[] ch,int[] freq,int len){
        PriorityQueue<HuffmanNode> pq=new PriorityQueue<>(len,new myComparator());

        for(int i=0;i<len;i++){
            HuffmanNode hf=new HuffmanNode();

            hf.c=ch[i];
            hf.data=freq[i];

            hf.left=null;   hf.right=null;

            pq.add(hf);
        }

        HuffmanNode root=null;

        while(pq.size()>1){

        }

        printHuff(root,"");
    }

    static void printHuff(HuffmanNode root,String s){
        
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
