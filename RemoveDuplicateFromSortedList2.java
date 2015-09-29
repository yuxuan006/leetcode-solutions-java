//Remove Duplicates from Sorted List II
/*
 Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 
 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        
        ListNode p = helper;
        while(p.next != null && p.next.next != null){
            if(p.next.val == p.next.next.val){
                int duplicate = p.next.val;
                while(p.next != null && p.next.val == duplicate){
                    p.next = p.next.next;
                }
            }else{
                p = p.next;
            }
        }
        return helper.next;
    }
}