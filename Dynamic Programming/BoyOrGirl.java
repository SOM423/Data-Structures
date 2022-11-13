//Problem Statement : https://codeforces.com/problemset/problem/236/A

public class BoyOrGirl {

	public static void main(String[] args) {
		
		
		String str="sevenkplus";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		if(map.size() %2 == 0)
		{
			System.out.println("CHAT WITH HER");
		}
		else {
			System.out.println("IGNORE HIM");
		}
		

	}

}
