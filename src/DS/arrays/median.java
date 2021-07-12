package DS.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class median {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        calMedi(arr,n);
    }

    static void calMedi(int[] arr, int len){
        PriorityQueue<Integer> sml = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> grt=new PriorityQueue<>();

        sml.add(arr[0]);
        System.out.print(arr[0]+" ");

        double med=arr[0];

        for(int i=1;i<len;i++){
            int x=arr[i];

            if(sml.size()> grt.size()){
                if(x<med){
                    grt.add(sml.remove());
                    sml.add(x);
                }
                else
                    grt.add(x);
                med=(double)(sml.peek()+ grt.peek())/2;
            }

            else if(sml.size()==grt.size()){
                if(x<med){
                    sml.add(x);
                    med=(double) sml.peek();
                }
                else{
                    grt.add(x);
                    med=(double) grt.peek();
                }
            }
            else{
                if(x<med){
                    grt.add(sml.remove());
                    sml.add(x);
                }
                else
                    grt.add(x);
                med=(double)(sml.peek()+ grt.peek())/2;
            }
            sb.append(med+" ");

        }

        System.out.println(sb.toString());

    }
}
