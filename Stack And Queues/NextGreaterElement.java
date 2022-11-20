
public class NextGreaterElement {

	public static void main(String[] args) {
		int[] abc= new int[] {1,3,2,4,5};
		int[] arr = canSeePersonsCount(abc);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
	
	public static int[] canSeePersonsCount(int[] A) {
		int n= A.length;
        int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();
    
    //Iterating loop from last element
		for(int i=n-1;i>=0;i--)
		{
			if(!stack.isEmpty())
			{
				while(!stack.isEmpty() && stack.peek() <= A[i])
				{
					stack.pop();
				}
			}
			if(stack.isEmpty())
			{
				result[i] =-1;
			}
			else {
				result[i] = stack.peek();
			}
			stack.push(A[i]);
			
		}
		
		return result;
		

}
}
