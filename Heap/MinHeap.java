package com.collection.java8;

import java.util.ArrayList;

public class MinHeap {
	
	
	static class Heap{
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		public void add(int data)    //O(log n)
		{
			al.add(data);
			
			int x = al.size()-1; //child Index
			
			int par = (x-1)/2;     //Parent Index
			
			while(al.get(x) < al.get(par))
			{
				//Swap the values
				int temp = al.get(x);
				
				al.set(x, al.get(par));
				al.set(par, temp);
				
				x = par;      //child become parent
				par = (x-1)/2;
			}
		}
		
		public int peek()
		{
			return al.get(0);
		}
		
		public void heapify(int i)  //O(log n)
		{
			int left = 2*i + 1;
			int right = 2*i + 2;
			int minIdx = i;
			
			if(left < al.size() && al.get(minIdx) > al.get(left))
			{
				minIdx = left;
			}
			
			if(right < al.size() && al.get(minIdx) > al.get(right))
			{
				minIdx = right;
			}
			
			if(minIdx != i)
			{
				// Swap
				int temp = al.get(i);
				
				al.set(i, al.get(minIdx));
				al.set(minIdx, temp);
				
				heapify(minIdx);
			}
		}
		
		public int remove()
		{
			int data = al.get(0);
			
			//Step 1 - Swap first and last
			
			int temp = al.get(0);
			al.set(0, al.get(al.size()-1));
			al.set(al.size()-1, temp);
			
			//Step 2 - Delete last
			
			al.remove(al.size()-1);
			
			//Step 3 : Heapify
			
			heapify(0);
			
			return data;
		}
		
		public boolean isEmpty()
		{
			return al.size()==0;
		}
	}

	public static void main(String[] args) {
		
		Heap h = new Heap();
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		
		while(!h.isEmpty())
		{
			System.out.println(h.peek());
			h.remove();
		}
	}

}
