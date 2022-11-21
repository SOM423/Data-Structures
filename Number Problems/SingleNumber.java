
public class Solution {
    public static int occursOnce(int[] a, int n) {
        // Write your code here.
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            int ele = a[i];
            if(map.containsKey(ele))
            {
                map.put(ele,map.get(ele)+1);
            }
            else
            {
                map.put(ele,1);
            }
        }
      for(Integer key : map.keySet())
      {
        if(map.get(key)==1)
            return key;
      }
        return -1;
    }
}
