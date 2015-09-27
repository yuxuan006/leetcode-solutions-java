//Swap Nodes in Pairs
/*
 Given a linked list, swap every two adjacent nodes and return its head.
 
 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.
 
 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)return null;
        
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode pre = helper;
        ListNode cur = head;
        
        while(pre.next != null && pre.next.next != null){
            ListNode next = cur.next;
            
            cur.next = next.next;
            pre.next = next;
            next.next = cur;
            
            pre = cur;
            cur = cur.next;
        }
        return helper.next;
    }
    
}