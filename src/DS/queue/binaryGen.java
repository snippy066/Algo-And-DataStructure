//package DS.queue;
/*binary number generation from 1 to n
ex :
    1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000
 */
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
        int i=1;
        while(i++<=n){
            String s=q.poll();

            q.add(s+"0");
            q.add(s+"1");

            sb.append(s+" ");
        }
    }
}
