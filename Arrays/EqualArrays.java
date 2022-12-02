class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Map<Long,Integer> map = new HashMap<Long,Integer>();
        
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
            
        }
        
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(B[i]))
            {
                map.put(B[i],map.get(B[i])-1);
            }
            else
            {
                map.put(B[i],1);
            }
        }
        
        for(Integer val : map.values())
        {
            if(val !=0)
            return false;
        }
        return true;
    }
    
}
