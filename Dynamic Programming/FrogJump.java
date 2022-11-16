
//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012?leftPanelTab=0
public class Solution {
    public static int frogJump(int n, int heights[]) {

        int[] dp = new int[1000002];
        Arrays.fill(dp,-1);
        
        int ans = helper(0,heights,dp);
        
        return ans;
        
    }
    public static int helper(int pos,int[] heights,int[] dp)
    {
        int op1=Integer.MAX_VALUE;
        int op2=Integer.MAX_VALUE;
        // Base Case
        if(pos == (heights.length-1))
        {
            return 0;
        }
        // DP Check
        if(dp[pos] !=-1) return dp[pos];
        
        //Check with pos + 1 th step
        if((pos+1) < heights.length)
        {
            op1 =  Math.abs(heights[pos]-heights[pos+1]) + helper(pos+1,heights,dp);
        }
        //Check with pos + 2 th step
        if((pos+2) < heights.length)
        {
            op2 = Math.abs(heights[pos]-heights[pos+2]) + helper(pos+2,heights,dp);
        }
        
        return dp[pos]=Math.min(op1,op2);
    }

}
