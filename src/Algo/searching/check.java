import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

// Remember that the class name should be "Main" and should be "public".
public class check{
    private static int mod=1000000007;
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        // Read the number of test casese.
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++) arr[i]=in.nextInt();
        Arrays.sort(arr);

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<m;i++){
            int val=in.nextInt();
            if(arr[0]==val || arr[n-1]==val)
                sb.append("0\n");
            else if(arr[0]>val){
                if((n&1) == 0) sb.append("POSITIVE\n");
                else sb.append("NEGATIVE\n");
            }
            else if(arr[n-1]<val){
                sb.append("POSITIVE\n");
            }
            else{
                int pos=getBound(arr,0,n,val)+1;
                if(pos==0)
                    sb.append("0\n");

                else if(((n-pos)&1)==1)
                    sb.append("NEGATIVE\n");
                else
                    sb.append("POSITIVE\n");
            }
        }
        System.out.println(sb.toString());
    }

    static int getBound(int[] arr,int l,int r, int key){
        if(r>=l){
            int mid=(l+r)/2;

            if(arr[mid]==key)
                return -1;

            else if(arr[mid]>key)
                return getBound(arr,l,mid-1,key);
            return getBound(arr,mid+1,r,key);
        }
        return r;
    }

    public static long power(long n,long p){
        long val=1;

        while(p>0){
            if((p&1)==1)
                val=(val*n)%mod;
            n=(n*n)%mod;
            p/=2;
        }
        return val;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}