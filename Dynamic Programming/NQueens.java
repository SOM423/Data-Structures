
//Problem Statement : https://www.codingninjas.com/codestudio/problems/n-queens_759332
 
public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n){
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int[][] board = new int[n][n];
        solve(0,n,board,ans);
       
        return ans;
    }
    
    static boolean isSafe(int x,int y,int[][] board,int n)
    {
        int i=x,j=y;
        while(i>=0 && j>=0)
        {
            if(board[i][j]==1) return false;
            i--;
            j--;
        }
        
        i=x;j=y;
        while(i>=0)
        {
            if(board[i][j]==1) return false;
            i--;
        }
        i=x;j=y;
        while(i>=0 && j<n)
        {
            if(board[i][j]==1) return false;
            i--;
            j++;
        }
        return true;
    }
    

    static void solve(int i,int n,int[][] board,ArrayList<ArrayList<Integer>> ans)
    {
        if(i>=n)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<n;y++)
                {
                    temp.add(board[x][y]);
                }
            }
            ans.add(temp);
            
        }
        else
        {
            for(int j=0;j<n;j++)
            {
                if(isSafe(i,j,board,n))
                {
                    board[i][j]=1;
                    solve(i+1,n,board,ans);
                    board[i][j]=0;
                }
            }
        }
    }
}
