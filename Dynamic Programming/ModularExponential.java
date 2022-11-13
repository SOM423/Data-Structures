public class Solution {
    public static int modularExponentiation(int x, int n, int m) {

        return (int)binaryExpo(x,n,m);
    }
    
    static long binaryExpo(int x,int n,int m)
    {
        if(n==1) return (long)x%m;  //imp
        long temp = binaryExpo(x,n/2,m);
        temp*=temp;
        temp%=m;
        if(n%2==1)
            temp*=x;
        temp%=m;
        return temp;
    }
}
