//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

class Solution {

   
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
        {
            return 1;
        }
        
        int sum =0;
        
        for(int i=0;i<n;i++)
        {
           sum +=arr[i];
           arr[i] =sum; 
        }
        
       for(int i=1;i<n;i++)
       {
           if(arr[i-1] == arr[n-1]-arr[i])
           return i+1;
       }
       return -1;
    }
}
