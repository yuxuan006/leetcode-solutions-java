//Linked List Cycle II
/*
 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 
 Note: Do not modify the linked list.
 
 Follow up:
 Can you solve it without using extra space?
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)return null;
        ListNode fast, slow;
        fast = head; slow = head;
        while(true){
            if(fast == null || fast.next == null)return null;
            
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)break;
        }
        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    
}