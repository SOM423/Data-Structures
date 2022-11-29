//https://leetcode.com/problems/roman-to-integer/description/
class Solution {
    public int romanToInt(String s) {
      Map<Character,Integer> map = new HashMap<Character,Integer>();

      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);
      
      int n = s.length()-1;
     int sum = map.get(s.charAt(n));

     for(int i=n-1;i>=0;i--)
     {
         if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
         {
             sum-=map.get(s.charAt(i));
         }
         else
         {
             sum+=map.get(s.charAt(i));
         }
     }
        return sum;
    }
}
