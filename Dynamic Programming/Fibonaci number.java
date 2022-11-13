Solution 1 :

public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int f=1;
        int s=1;
        int t=0;
        if( n==1 || n==2 ) return 1;
        for(int i=3;i<=n;i++)
        {
            t=(int)((f+s)%(1e9 +7));
            f=s;
            s=t;
        }
        return t;
        
    }


Solution 2 : Top Down Approach

public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return fibo(n,arr);
    }
    
    public static int fibo(int n,int[] dp)
    {
        if(n==1 || n==2) return 1;
        if(n<=0) return 0;
        if(dp[n]!=-1) return dp[n];
        int ans = fibo(n-1,dp) + fibo(n-2,dp);
        ans = (int) (ans % (1e9 +7));
        dp[n] =ans;
        return ans;
    }
}


Solution 3 : Bottom down Approach

public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return fibo(n,arr);
    }
    
    public static int fibo(int n,int[] dp)
    {
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=(int)((dp[i-1] + dp[i-2]) % (1e9 +7));
        }
        return dp[n-1] ;
    }
}
