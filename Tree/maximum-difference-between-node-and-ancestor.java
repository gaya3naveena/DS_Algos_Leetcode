/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Max difference = maximum node - minimum node 
class Solution 
{
   int res = 0;
    
    public int maxAncestorDiff(TreeNode root)
    { 
        helper(root, root.val, root.val);
        return res;
       
    }
    
    
    public void helper(TreeNode root,int max, int min)
    {
        
        if(root == null)
            return;
        
        if(root.val > max )
            max = root.val;
        
        if(root.val < min )
            min = root.val;
        
        res = Math.max(max-min, res);
        
        helper(root.left, max, min);
        helper(root.right, max, min);
        
    }
}