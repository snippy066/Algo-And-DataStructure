//package Algo.backtracking;
//string replacement using backtracking and recursion


public class stringReplace {
    public static void main(String ar[]){
        char[] pattern = "1?11?00?1?".toCharArray();
        printAllCombinations(pattern, 0);
    }

    static void printAllCombinations(char[] patter,int i){
        if(i==patter.length){
            System.out.println(patter.toString());
            return;
        }

        if(patter[i]=='?'){
            for(char ch=0;ch<=1;ch++){
                patter[i]=ch;
                printAllCombinations(patter,i+1);
                patter[i]='?';  //backtracking
            }

        }
    }
}
