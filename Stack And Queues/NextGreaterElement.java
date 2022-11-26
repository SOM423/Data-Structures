class Solution
{
    //https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
    
    public static long[] nextLargerElement(long[] arr, int n)
    { 
       
        
       long[] ans = new long[arr.length];
       Arrays.fill(ans,-1);
       
       Stack<Integer> stack = new Stack<>();
       
       for(int i=0;i<arr.length;i++)
       {
           while(stack.size() !=0 && arr[stack.peek()] < arr[i])
           {
               ans[stack.peek()] = arr[i];
               stack.pop();
           }
           
           stack.push(i);
       }
        return ans;
    } 
}
