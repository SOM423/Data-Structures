public class Solution 
{
    public static int painters(ArrayList<Integer> boards,int cap)
    {
        int painterNumber=1;
        int remCap=cap;
        for(int i=0;i<boards.size();i++)
        {
            if(boards.get(i) <= remCap)
            {
                remCap -= boards.get(i);
            }
            else
            {
                painterNumber++;
                remCap=cap;
                remCap-=boards.get(i);
            }
            
            
        }
        return painterNumber;
    }
    
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int max_value=0;
        int sum=0;
        
        for(int i=0;i<boards.size();i++)
        {
            sum +=boards.get(i);
            if(boards.get(i) > max_value)
            {
                max_value = boards.get(i);
            }
        }
        
        for(int i =max_value;i<=sum;i++)
        {
            if(painters(boards,i) <=k) return i;
        }
        return -1;
    }
}

//Solution 2 : Binary Search :


public class Solution 
{
    public static int painters(ArrayList<Integer> boards,int cap)
    {
        int painterNumber=1;
        int remCap=cap;
        int n=boards.size();
        for(int i=0;i<n;i++)
        {
            if(boards.get(i) <= remCap)
            {
                remCap-=boards.get(i);
            }
            else
            {
                painterNumber++;
                remCap=cap;
                remCap-=boards.get(i);
            }
            
            
        }
        return painterNumber;
    }
    
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int max_value=0;
        int sum=0;
        int ans=0;
        int n=boards.size();
        for(int i=0;i<n;i++)
        {
            sum +=boards.get(i);
            if(boards.get(i) > max_value)
            {
                max_value = boards.get(i);
            }
        }
        
        int s=max_value;
        int e=sum;
        
        while(s<=e)
        {
            int m=s+(e-s)/2;
           int  reqPainters = painters(boards,m);
            if(reqPainters <=k)
            {
               ans=m;
               e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
}
