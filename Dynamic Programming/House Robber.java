problem Statement :  https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
      int[] dp = new int[n+1];
      Arrays.fill(dp,-1);
      return robber(0,nums,dp);  
    }


    public static int robber(int pos,int[] house,int[] dp)
    {
        if(pos >= house.length)
        {
            return 0;
        }

        if(dp[pos]!=-1) return dp[pos];

        int choice1 = house[pos] + robber(pos+2,house,dp);       //Do Robberry          
        int choice2 = 0 + robber(pos+1,house,dp);       //Not robbering

        return dp[pos]=Math.max(choice1,choice2);

    }
}
