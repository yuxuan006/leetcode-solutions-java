//Binary Tree Postorder Traversal
/**
 Given a binary tree, return the postorder traversal of its nodes' values.
 
 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [3,2,1].
 
 Note: Recursive solution is trivial, could you do it iteratively?
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//recursive
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null)return res;
        find(res, root);
        return res;
    }
    public void find(List<Integer> res, TreeNode root){
        if(root == null)return;
        if(root.left != null)find(res, root.left);
        if(root.right != null)find(res, root.right);
        res.add(root.val);
    }
    
}