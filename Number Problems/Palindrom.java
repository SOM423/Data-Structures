class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
         long x = n;
        long sum =0;
        long rem =0;
        
        while(x > 0)
        {
            rem = x % 10;
            x = x /10;
            
            sum = sum *10 + rem;
        }
        if(sum == n)
        return "Yes";
        else
        return "No";
    }
}
