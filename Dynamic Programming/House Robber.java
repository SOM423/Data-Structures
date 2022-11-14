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

//Solution 2 : Tabulation Method

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[n+2];
        Arrays.fill(dp,-1);
        
       dp[n] =0;
       dp[n+1]=0;
       
       for(int i=n-1;i>=0;i--)
       {
           dp[i]=Math.max(arr[i]+dp[i+2],0+dp[i+1]);
       }
       return dp[0];
    }
}
