public class WinesProblem {
	
	public static void main(String[] args) {
		
		int[][][] dp = new int[100][100][101];
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				for(int k=0;k<101;k++)
				{
					dp[i][j][k]=-1;
				}
			}
		}
			Scanner s = new Scanner(System.in);
			int[] arr = new int[] {10,1,10,9};
			
			int N = arr.length;
			
			System.out.println(profit(arr,0,N-1,1,dp));
		}
		
		public static int profit(int[] arr,int l,int r,int year,int[][][] dp)
		{
		    if(year > arr.length) return 0;
		    
		    if(dp[l][r][year] != -1) return dp[l][r][year];
		    int pr1=(arr[l] * year) + profit(arr,l+1,r,year+1,dp);
		    int pr2=(arr[r] * year) + profit(arr,l,r-1,year+1,dp);
		    
		    return dp[l][r][year]=Math.max(pr1,pr2);
		}

}
