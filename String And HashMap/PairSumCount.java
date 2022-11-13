class Solution {
    int getPairsCount(int[] arr, int n, int k) {
      
       int count =0;
      Map<Integer,Integer> map = new HashMap<>();
       
       for(int i=0;i<n;i++)
       {
        int target = k - arr[i];
        
        if(map.containsKey(target))
        {
            count += map.get(target);
        }
        if(map.containsKey(arr[i]))
        {
            map.put(arr[i],map.get(arr[i])+1);
        }
        else
        {
            map.put(arr[i],1);
        }
        
       }

      return count;
    }
}
