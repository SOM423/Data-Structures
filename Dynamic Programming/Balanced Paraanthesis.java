//Problem Stataement : https://www.codingninjas.com/codestudio/problems/return-parentheses_920446?leftPanelTab=0

import java.util.* ;
import java.io.*; 

public class Solution {
	public static List<String> balancedParantheses(int n) {
		// Write your code here
        List<String> list = new ArrayList<String>();
        help(0,0,n,"",list);
        
        return list;
	}
    
    public static void help(int o,int c,int n,String temp,List<String> ans)
    {
        if(c==n)
        {
            ans.add(temp);
        }
        else
        {
            if(o < n)
            {
                help(o+1,c,n,temp+"(",ans);
            }
            if(c < o)
            {
                help(o,c+1,n,temp+")",ans);
            }
        }
    }
}
