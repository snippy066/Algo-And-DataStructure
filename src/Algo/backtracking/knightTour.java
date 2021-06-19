package Algo.backtracking;
import java.util.*;

public class knightTour {
    private static int siz;
    private static int[][] sol;
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        siz=n;
        solvKt(n);

    }

    public static boolean solvKt(int n){
        sol=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                sol[i][j]=-1;
        }

        int[] xmove={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] ymove={ 1, 2, 2, 1, -1, -2, -2, -1 };

        sol[0][0]=0;

        if(soluti(0,0,1,sol,xmove,ymove)) {
            solprint(sol, n);
            return true;
        }
        else
            System.out.println("solution doesn't exists");

        return false;
    }

    static boolean soluti(int x,int y,int move,int[][] sol,int[] xmo,int[] ymov){
        if(move==siz*siz)
            return true;

        for(int i=0;i<siz;i++){
            //System.out.println("in "+i);
            int nex_xmov=x+xmo[i];
            int nex_ymov=y+ymov[i];

            if(check(nex_xmov,nex_ymov,sol)){
                sol[nex_xmov][nex_ymov]=move;
                if(soluti(nex_xmov,nex_ymov,move+1,sol,xmo,ymov))
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
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    static boolean check(int x,int y,int[][] sol){
        return (x >= 0 && x < siz && y >= 0 && y < siz
                && sol[x][y] == -1);
    }
}
