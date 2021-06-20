package Algo.greedy;
import java.util.*;

public class activeSec {
    private static StringBuilder sb;
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start =new int[n];
        int[] end=new int[n];

        for(int i=0;i<n;i++)     start[i]=sc.nextInt();
        for(int i=0;i<n;i++)     end[i]=sc.nextInt();

        sb=new StringBuilder();
        sb.append(0+" ");
        int i=0;
        for(int j=1;j<n;j++){
            if(start[j]>=end[i]){
                sb.append(j+" ");
                i=j;
            }
        }
    }
}
