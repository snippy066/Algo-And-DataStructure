package Algo.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class huffmanCoding {
    private static StringBuilder sb=new StringBuilder();
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
            HuffmanNode x,y;
            x=pq.poll();
            y=pq.poll();

            HuffmanNode newTree=new HuffmanNode();

            newTree.data=x.data+y.data;
            newTree.c='-';

            newTree.left=x;
            newTree.right=y;

            root=newTree;

            pq.add(root);

        }

        printHuff(root,"");
    }

    static void printHuff(HuffmanNode root,String s){

        if(root.left==null && root.right==null){
            sb.append(root.c +" : "+s);
            return;
        }
        printHuff(root.left,s+"0");
        printHuff(root.right,s+"1");

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
