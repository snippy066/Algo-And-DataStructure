//package Algo.DP;
//longest common string problem using dynamic programming with complexity O(m.n) using memoization

import java.util.HashMap;
import java.util.Map;

public class LCS {
    public static void main(String ar[]){
        String X = "ABCBDAB", Y = "BDCABA";


        Map<String, Integer> lookup = new HashMap<>();

        System.out.print("The length of the LCS is "
                + LCSLength(X, Y, X.length(), Y.length(), lookup));
    }
    static int LCSLength(String x,String y,int m, int n,Map<String,Integer> l){
        if(m==0||n==0)
            return 0;

        String key=m+"_"+n;

        if(!l.containsKey(key)){
            if(x.charAt(m-1)==y.charAt(n-1))
                l.put(key,LCSLength(x,y,m-1,n-1,l));

            else{
                l.put(key,Math.max(LCSLength(x,y,m-1,n,l),LCSLength(x,y,m,n-1,l)));
            }

        }
        return l.get(key);
    }
}

