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
//iterative using two stacksßß
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null)return res;
        TreeNode cur = root;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(root);
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        while(s1.empty() == false){
            TreeNode temp = s1.pop();
            s2.push(temp);
            if(temp.left!=null)s1.push(temp.left);
            if(temp.right!=null)s1.push(temp.right);
        }
        while(s2.empty() == false){
            res.add(s2.pop().val);
        }
        return res;
    }
}
//iterative using one stack
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null)return res;
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        do{
            while(root != null){
                if(root.right != null){
                    s.push(root.right);
                }
                s.push(root);
                root = root.left;
            }
            
            root = s.pop();
            if(s.empty() == false&&root.right!=null && s.peek() == root.right){
                s.pop();
                s.push(root);
                root = root.right;
            }else{
                res.add(root.val);
                root = null;
            }
            
        }while(s.empty() == false);
        return res;
    }
}