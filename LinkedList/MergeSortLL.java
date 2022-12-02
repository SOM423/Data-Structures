//https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1
//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        
        //Base condition
        if(head == null || head.next==null)
		{
			return head;
		}
        // step 1 : get Mid point
        Node mid = getMid(head);
        
        // step 2 : segregate left and right part
        Node rightHead = mid.next;
        mid.next = null;
        
        Node newLeftHalf = mergeSort(head);
        Node newRightHalf = mergeSort(rightHead);
        
        
        // step 3 : merge both left and right
        return merge(newLeftHalf,newRightHalf);
    }
    
    public static Node getMid(Node head)
    {
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast !=null && fast.next!=null)
        {
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow;
    }
    
    public static Node merge(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while(head1 != null && head2!= null)
        {
            if(head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        
        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return mergedLL.next;
    }
}


