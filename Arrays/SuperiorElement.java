//Q. Find Superior Element -> Element Which Have No Greater Element To Its Right
public class Solution {
	
	public static void main(String[] args)
	{
		
		int[] arr= new int[] {7,9,5,4,3,3,1 };
		
		System.out.println(superierEle(arr));

	}
	
	public static int superierEle(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=arr.length -1;i>=0;i--)
		{
			
			if(arr[i]>= max)
			{
				count = count+1;
				max=arr[i];
			}
		}
		return count;
	}
