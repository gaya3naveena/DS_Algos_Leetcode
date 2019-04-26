/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root)
    {
        return helper(root, 0);
            
    }
    
    
    public int helper(TreeNode root, int val)
    {
         if (root == null) return 0;
        val = val * 2 + root.val;
        return root.left == root.right ? val : helper(root.left, val) + helper(root.right, val);
    }
}