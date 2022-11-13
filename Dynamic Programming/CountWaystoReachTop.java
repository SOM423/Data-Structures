public class Solution {
	public static int countDistinctWayToClimbStair(long nStairs) {
		
        return countWays(nStairs,0);
	}
    
    static int countWays(long n,long i)
    {
        if(i==n) return 1;
        if(i > n) return 0;
        int x = countWays(n,i+1);
        int y = countWays(n,i+2);
        
        return x+y;
    }
}

//Solution 2 : Reverse (DownStairs)

public static int countDistinctWayToClimbStair(long nStairs) {
		
        return countWays(nStairs);
	}
    
    static int countWays(long n,long i)   //here i is the current standing posistion
    {
        if(n==0) return 1;           //Base cond
        if(n<0) return 0;			// Base cond 2
        int x = countWays(n-1);
        int y = countWays(n-2);
        
        return x+y;
    }
}
