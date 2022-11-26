class Solution {
    public int maxDepth(String s) {
        
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            count = count+1;
            if(count > max) max=count;
            if(s.charAt(i)==')')
            count=count-1;
        }
        return max;
    }
}
