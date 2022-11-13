
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
     int a= minCost(cost,0);
     int b= minCost(cost,1);
        
    int ans = (a<b) ? a : b;
     
     return ans;   
        
    }
    
    static int minCost(int[] arr,int i)
    {
        int n = arr.length;
        if(i >= n) return 0;
        
        int x = minCost(arr,i+1);
        int y = minCost(arr,i+2);
        
        
        int min = (x<y)? x+arr[i] : y+arr[i];
        return min;
        
    }
}
