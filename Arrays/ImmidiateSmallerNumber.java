
public class Solution {
       public static int[] immediateSmaller(int arr[], int n) {
          //Write your code here
           
           int[] result = new int[n];
           
           for(int i=0;i<n-1;i++)
           {
                    int j=i+1;
                    if(arr[j] < arr[i])
                    {
                        result[i]=arr[j];
                    }
                    else
                    {
                        result[i]=-1;
                    }
           }
           result[n-1]=-1;
           return result;
       }  
}
