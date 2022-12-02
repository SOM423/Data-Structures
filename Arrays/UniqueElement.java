class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> val : map.entrySet())
        {
            if(val.getValue()==1)
            return val.getKey();
        }
        return -1;
    }
}
