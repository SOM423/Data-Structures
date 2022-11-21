
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
     
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      
      for(int i=0;i<n;i++)
      {
        if(arr[i] < min)
        {
            min=arr[i];
        }
        if(arr[i] > max)
        {
            max=arr[i];
        }
      }
      return min+max;
  }
}
