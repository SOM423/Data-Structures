class Solution { 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        help(nums,0,ans,new ArrayList<>());
        
        return ans;
    }

    public static void help(int[] arr,int i,List<List<Integer>> ans,List<Integer> temp)
    {
        if(i==arr.length )
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        else

		
        {
            help(arr,i+1,ans,temp);  //Ignoring Element
            temp.add(arr[i]);        //Consider element and put in helper
            help(arr,i+1,ans,temp);
            temp.remove(temp.size()-1);   //Backtracking
        }
        
    }
}
