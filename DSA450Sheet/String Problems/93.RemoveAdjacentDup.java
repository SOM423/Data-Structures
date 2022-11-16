
class Solution{
    public String removeConsecutiveCharacter(String S){
        if(S.length()==0)
        return "";
        String temp="";
        ArrayList<Character> al = new ArrayList<>();
        
        al.add(S.charAt(0));
        
        for(int i=1;i<S.length();i++)
        {
            char c = S.charAt(i);
            if(al.get(al.size() -1) !=c)
            {
                al.add(c);
            }
        }
        for(int i=0;i<al.size();i++)
        {
            temp += al.get(i);
        }
        return temp;
    }
}

//Using Recursion 

class Solution{
    public String removeConsecutiveCharacter(String S){
       
       if(S.length() ==0 || S.length() ==1)
       {
           return S;
       }
       if(S.charAt(0)==S.charAt(1))
       
       return removeConsecutiveCharacter(S.substring(1));
       
       else
       
       return S.charAt(0) + removeConsecutiveCharacter(S.substring(1));
       
    }
}
