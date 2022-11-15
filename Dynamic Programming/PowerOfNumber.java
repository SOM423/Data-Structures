

class Solution {
    public double myPow(double x, int n) {
        
    if(n>0)
    return helper(x,n);
    else
    return helper(1/x,-1*n);
  


    }

    public static double helper(double x, int n)
    {
        if(n==0) return 1;

        double res = helper(x,n/2);

        if(n%2 ==0)
        return res * res;
        else
        return x * res * res;
    }


}
