class Solution {
    public boolean stoneGame(int[] piles) {
      int n = piles.length;
      int[][] dp = new int[1001][1001];
      for(int i=0;i<1001;i++)
      {
          for(int j=0;j<1001;j++)
          {
              dp[i][j] = -1;
          }
      }

      int ans = game(0,n-1,piles,dp);
      if(ans > 0)
      return true;
      else 
      return false;

    }

    public static int game(int s,int e,int[] piles,int[][] dp)
    {
        if(s > e) return 0;
        if(dp[s][e] !=-1)    return dp[s][e];
        int op1 = piles[s] - game(s+1,e,piles,dp);
        int op2 = piles[e] - game(s,e-1,piles,dp);

        return dp[s][e]=Math.max(op1,op2); 
    }
}
