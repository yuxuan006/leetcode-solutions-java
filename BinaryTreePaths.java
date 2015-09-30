//Binary Tree Paths
/*
 Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.*/
/**
 Given a binary tree, return all root-to-leaf paths.
 
 For example, given the following binary tree:
 
   1
 /   \
 2    3
  \
  5
 All root-to-leaf paths are:
 
 ["1->2->5", "1->3"]
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null)return res;
        findPath(root, res, root.val + "");
        return res;
    }
    public void findPath(TreeNode root, List<String> res, String path){
        if(root.right == null && root.left == null){
            res.add(path);
            return;
        }
        if(root.right != null)findPath(root.right, res, path + "->" + root.right.val);
        
        if(root.left != null)findPath(root.left, res, path + "->" + root.left.val);
        
    }
    
}