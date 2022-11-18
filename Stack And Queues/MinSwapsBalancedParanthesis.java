class Solution {
    public int minSwaps(String s) {
       return checkMinSwaps(s); 
    }

    public static int checkMinSwaps(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(c=='[')
            {
                stack.push(c);
            }
            else
            {
                if(!stack.isEmpty() && stack.peek()=='[')
                {
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
        }
       
        return ((stack.size()/2)+1)/2;
    }
}
