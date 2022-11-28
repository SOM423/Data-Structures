//https://www.codingninjas.com/codestudio/problems/elements-occur-more-than-n-k-times_1113146?leftPanelTab=0
public class Solution {
	public static ArrayList<Integer> countTheNumber(ArrayList<Integer> arr, int n, int k) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
            int a = arr.get(i);
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
        }
        
        map.entrySet().stream().filter(x-> x.getValue()>=n/k).forEach(x -> ans.add(x.getKey()));
        return ans;
	}
}
