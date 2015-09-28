//Partition List
/*
 Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 
 You should preserve the original relative order of the nodes in each of the two partitions.
 
 For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
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
    public ListNode partition(ListNode head, int x) {
        if(head == null)return null;
        
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode p1, p2;
        p1 = small; p2 = large;
        
        while(head != null ){
            if(head.val < x){
                small.next = head;
                small = small.next;
            }
            else{
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        small.next = p2.next;
        large.next = null;
        return p1.next;
    }
    
}