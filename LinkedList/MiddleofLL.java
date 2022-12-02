//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node slow = head;
         Node fast = head;
         
         while(fast != null && fast.next!=null)
         {
             slow = slow.next;
             fast = fast.next.next;
             
         }
         return slow.data;
    }
}
