
public class Solution {

	public static boolean checkPalindrome(String str) {
	
	    // WRITE YOUR CODE HERE	
        String str1 = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        
        int len = str1.length();
        for(int i=0;i<len/2;i++)
        {
            if(str1.charAt(i) != str1.charAt(len-1-i))
            {
                return false;
            }
        }
        return true;

	}
 
}
