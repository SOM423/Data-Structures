//https://leetcode.com/problems/add-strings/description/
import java.util.*;
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       
       BigInteger str1 = new BigInteger(num1);

       BigInteger str2 = new BigInteger(num2);

       BigInteger sum = str1.add(str2);

       return sum.toString();
        
    }
}
