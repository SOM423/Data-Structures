import java.util.* ;
import java.io.*; 

public class Solution{
    public static int[][] dp = new int[1001][1001];
    public static int helper(int[] weight, int[] value, int n, int maxWeight)
    {
        if(n==0 || maxWeight==0)
        {
            return 0;
        }
        if(dp[n][maxWeight] !=-1) return dp[n][maxWeight];
        if(maxWeight < weight[n-1]) 
            {
            return dp[n][maxWeight] =helper(weight,value,n-1,maxWeight);
        }
        
        int op1 = helper(weight,value,n-1,maxWeight);
        
        int op2 = helper(weight,value,n-1,maxWeight - weight[n-1]) + value[n-1];
        
        return dp[n][maxWeight] = Math.max(op1,op2);
        
    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        
                             
          for(int i=0;i<=n;i++)
        {
              for(int j=0;j<=maxWeight;j++)
                      {
                        dp[i][j]=-1;
                }
           }
        return helper(weight,value,n,maxWeight);
        

    }
}

Method 2 : Tabulation Method 
class Solution{
	
 static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        
        for(int i = 0;i<=n;i++)
        {
            for(int j=0;j<=maxWeight;j++)
            {
                if(i==0 || j==0) dp[i][j]=0;
                
                else if(j< weight[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    int op1 = dp[i-1][j];
                    int op2 = dp[i-1][j-weight[i-1]] + value[i-1];
                    dp[i][j] = Math.max(op1,op2);
                }
                
            }
        }
        return dp[n][maxWeight];
    }
}
