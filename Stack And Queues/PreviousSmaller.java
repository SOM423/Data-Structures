public class Solution {
	
	public static void main(String[] args)
	{
		
		int[] arr= new int[] {5, 7, 4, 9, 8, 10};
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			while(stack.size()!=0 && arr[stack.peek()] > arr[i])
			{
				ans[stack.peek()] = arr[i];
				stack.pop();
			}
			stack.push(i);
		}
		
		for(int a : ans)
		{
			System.out.print(a+" ");
		}
	

	}
	
