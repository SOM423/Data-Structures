//Solution 1 :

class Solution
{
  
    static boolean ispar(String x)
    {
        
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        Stack<Character> stack = new Stack<>();
        
        
        if (x == null || x.length() == 1) return false;
        
        
        for(int i=0;i<x.length();i++)
        {
            char s = x.charAt(i);
           if(map.containsKey(s))
           stack.push(s);
           
           else if(stack.isEmpty() || map.get(stack.pop()) !=s)
           return false;
            
        }
        
        return stack.isEmpty();
	}
}

//Solution 2 :

class Solution
{
   
    static boolean ispar(String x)
    {
        
         Stack<Character> stack = new Stack<Character>();
      for(int i=0;i<x.length();i++){
          char a=x.charAt(i);
            
            
            
          if(a=='{' || a=='[' || a=='(')
          {
              stack.push(a);
				continue;
          }
            
          if(stack.isEmpty())
          return false;
            
          char check;
          switch(a)
          {
              case')': 
                  check =stack.pop();
                  if(check=='[' || check=='{')
                  return false;
                  break;
                    
              case '}':
                  check=stack.pop();
                  if(check=='[' || check=='(')
                  return false;
                  break;
                    
              case ']':
                  check=stack.pop();
                  if(check=='{' || check=='(')
                  return false;
          }
      }
      return (stack.isEmpty());
    }
}
