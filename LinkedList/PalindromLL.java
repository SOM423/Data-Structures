/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       //Base case
       if(head ==null || head.next==null)
       {
           return true;
       }
        //1.Find Mid Element
        ListNode mid = midElement(head);

        //2.Reverse Second Half

        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while(curr !=null)
        {
            next = curr.next;
            curr.next=prev;
            prev =curr;
            curr = next;
        }
        ListNode rightHead = prev;
        ListNode leftHead = head;

        //3.Check if Equals
        while(rightHead != null)
        {
            if(leftHead.val != rightHead.val)
            {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
       return true;
        
    }

    public ListNode midElement(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null)
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

}
