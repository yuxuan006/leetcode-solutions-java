//Linked List Cycle
/*
 Given a linked list, determine if it has a cycle in it.
 
 Follow up:
 Can you solve it without using extra space?
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)return false;
        ListNode fast, slow;
        fast = slow = head;
        while((fast != null) && (fast.next != null)){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)return true;
        }
        return false;
    }
    
}