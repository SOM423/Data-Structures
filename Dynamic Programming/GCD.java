public class Solution {
    public int gcd(int A, int B) {
       if(A==0)
       return B;
       
       if(B==0)
       return A;
       
       //Base Case
       if(A==B)
       {
           return A;
       }
       
       if(A > B)
       {
           return gcd(A-B,B);
       }
       else
       return gcd(A,B-A);
    }
}
