//Solution 1 : 

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        
        Arrays.sort(a);
        int maj = a[size/2];
        int ans =0;
        
        for(int i=0;i<size;i++)
        {
            if(a[i]==maj)
            ans++;
            
            if(ans > size/2 )
            return maj;

        }
        return -1;
    }
}

//Solution 2 :


public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            
            if(map.get(arr[i]) > n/2) return arr[i];
        }
        return -1;
	}
}

//Solution 3 : Moore voting algorithm

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        
        int candidate = a[0];
        int votes =0;
        int freq=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==candidate)
            {
                votes++;
            }
            else
            {
                votes --;
            }
            
            if(votes ==0)
            {
                candidate = a[i];
                votes=1;
            }
        }
        for(int i=0;i<size;i++)
        {
            if(a[i]==candidate) freq++;
            
        }
        if(freq > size/2) return candidate;
        else
        return -1;
    }
}
