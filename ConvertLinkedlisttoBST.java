//Convert Sorted List to Binary Search Tree
/*
 Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)return null;
        this.head = head;
        
        int len = getLength(head);
        return buildBST(0, len-1);
    }
    public int getLength(ListNode head){
        int len = 0;
        ListNode h = head;
        while(h != null){
            len++;
            h = h.next;
        }
        return len;
    }
    //build the tree buttom-up
    public TreeNode buildBST(int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        
        TreeNode left = buildBST(start, mid-1);
        TreeNode root = new TreeNode(head.val);
        head = head.next;
        
        root.left = left;
        root.right = buildBST(mid+1, end);
        
        return root;
    }
    
}