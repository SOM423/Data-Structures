public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        int ans=0;
        for(int i=0;i<N;i++)
        {
            int start=arr[i];
            while(findNumber(start,arr))
            {
                start++;
            }
            if(start-arr[i] > ans)
              ans = start - arr[i];
        }
        return ans;
    }
    
    static boolean findNumber(int num, int[] arr)
    {
        for(int a: arr)
        {
            if(a == num ) return true;
        }
        return false;
    }
    
    
}

//solution 2 :

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        
        Arrays.sort(arr);
        int seqlength=1;
        int maxlength=1;
        
        for(int i=1;i<N;i++)
        {
          if(arr[i] ==arr[i-1]+1)
          {
            seqlength++;
          }
            else if(arr[i]==arr[i-1]) continue;
            
            else{
                seqlength=1;
            }
            if(seqlength > maxlength)
                maxlength=seqlength;
        }
        
        return maxlength;
    }
}
