public class PlayerWinOrLooseGame {

	public static void main(String[] args) {

		System.out.println(help(5));
	}
	
	
	public static int help(int n)
	{
		if(n==1) return 0;
		
		for(int i=1;i<n;i++)
		{
			if(n % i == 0)
			{
				if(help(n-i) == 0)
				return 1;	
			}
		}
		return 0;
	}

}

//Dynamic Programming Approaches

public class PlayerWinLooseDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(game(n,dp));
		System.out.println(gamedp(n, dp));
		
		boolean result = gameSimpleSolution(n);
		if(result) 
			System.out.println("1");
		else
			System.out.println("0");
	}
	
	
	public static int game(int n,int[] dp)
	{
		if(n==1) return 0;
		if(dp[n] != -1) return dp[n];
		for(int i=1; i<n; i++)   
		{
			if(n%i == 0)
			{
				if(game(n-i,dp) == 0) return dp[n]=1;
			}
		}
		return dp[n]= 0;
	}

	
	
	// in this scenario we are calling for loop till underroot of n to reduce time complexity
	// so basically we are finding factors for 1st half and remaining from second half we are 
    // finding by dividing a number to it.
	public static int gamedp(int n,int[] dp)
	{
		if(n==1) return 0;
		
		if(dp[n] != -1) return dp[n];
		
		for(int i=1; i*i<n; i++)   
		{
			if(n%i == 0)
			{
				int sf = n/i;     //calculating second factor
				if(game(n-i,dp) == 0) return dp[n]=1;
				if((i!=1) && game(n-sf,dp)==0) return dp[n]=1;
			}
		}
		return dp[n]= 0;
	}
	
	
	// Approach 3
	public static boolean gameSimpleSolution(int n)
	{
		return n%2==0;
	}

}
