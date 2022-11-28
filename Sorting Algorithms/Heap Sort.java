public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{2,4,3,1,5};
		
		heapSort(arr);
		
		for(int a : arr)
		{
			System.out.print(a +" ");
		}

	}
	
	
	public static void heapSort(int[] arr)
	{
		//Step -1 : Build Max Heap
		int n= arr.length;
		
		for(int i=n/2; i>=0; i--)
		{
			heapify(arr,i,n);
		}
		
		//Push Largest Element at end
		for(int i=n-1;i>0;i--)
		{
			//Swap (largest, first with last)
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, 0, i);
		}
	}


	public static void heapify(int[] arr, int i, int size) {
		// TODO Auto-generated method stub
		
		int left = 2*i+1;
		int right = 2*i+2;
		int maxIdx =i;
		
		if(left < size && arr[maxIdx] < arr[left])
		{
			maxIdx = left;
		}
		
		if(right < size && arr[maxIdx] < arr[right])
		{
			maxIdx = right;
		}
		
		if(maxIdx != i)
		{
			//swap
			int temp = arr[i];
			arr[i] = arr[maxIdx];
			arr[maxIdx] = temp;
			
			heapify(arr, maxIdx, size);
		}
		
		
	}

}
