public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		ArrayList<String> arr= (ArrayList<String>) findPermutations(str);

		for(String i : arr)
		{
			System.out.println(i );
		}


	}
	
	    public static List<String> findPermutations(String s) {
	        // Write your code here.
	        ArrayList<String> al = new ArrayList<String>();
	        
	        perm(s,0,s.length()-1,al);
	        return al;
	        
	    }
	    
	    static String swap(String str,int i,int j)
	    {
	    	char temp; 
	        char[] charArray = str.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    }
	    
	    static void perm(String str, int l, int r,ArrayList<String> ans) 
	    { 
	        if (l == r) 
	            ans.add(str);
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str = swap(str,l,i); 
	                perm(str, l+1, r,ans); 
	                str = swap(str,l,i); 
	            } 
	        } 
	    } 
	    
	   
	}
