//package DS.queue;
//binary number generation from 1 to n

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class binaryGen {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        genBinary(n);
        System.out.println(sb.toString());
    }

    static void genBinary(int n){
        Queue<String> q=new ArrayDeque<>();

        q.add("1");

        while(!q.isEmpty()){
            String s=q.poll();

            q.add(s+"0");
            q.add(s+"1");

            sb.append(s);
        }
    }
}
