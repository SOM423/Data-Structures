//GFG Link : https://practice.geeksforgeeks.org/problems/perfect-arrays4645/1

Solution :

class PerfectArray{
    
    public boolean IsPerfect(int arr[], int n)
    {
      Complete the function
        for(int i=0;i<n;i++)
        {
            if(arr[i] != arr[n-i-1] ) return false;
           
       
    }
     return true;
    }
    
}
