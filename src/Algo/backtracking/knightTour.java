package Algo.backtracking;
import javax.swing.*;
import java.util.*;

public class knightTour {
    private static int siz;
    private static int[][] sol;
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        solvKt(n);
        siz=n;
    }

    public static void solvKt(int n){
        sol=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                sol[i][j]=-1;
        }

        int[] xmove={2,2,-2,-2,1,1,-1,-1};
        int[] ymove={1,-1,1,-1,2,-2,2,-2};

        sol[0][0]=0;

        if(!solext(0,0,1,sol,xmove,ymove))   //(0,0) starting co-ordinate and 1 for move refrence
            System.out.println("sol doesn't exists");
        else
            solprint(sol,n);
    }

    static boolean solext(int x,int y,int move,int[][] sol,int[] xmo,int[] ymov){

        if(move==siz*siz)
            return true;
        for(int i=0;i<siz;i++){
            int nex_xmov=x+xmo[i];
            int nex_ymov=y+ymov[i];

            if((nex_xmov>=0 && nex_xmov<siz && nex_ymov>=0
                    && nex_ymov<siz && sol[nex_xmov][nex_ymov]==-1 )){
                sol[nex_xmov][nex_ymov]=move;
                if(solext(nex_xmov,nex_ymov,move+1,sol,xmo,ymov))
                    return true;
                else
                    sol[nex_xmov][nex_ymov]=-1;
            }
        }
        return false;
    }

    static void solprint(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
