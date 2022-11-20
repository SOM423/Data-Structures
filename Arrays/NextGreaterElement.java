class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        long[] result = new long[n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j] > arr[i])
                {
                    result[i]=arr[j];
                    break;
                }
                else
                {
                    result[i]=-1;
                }
            }
        }
        return result;
        
    } 
}
