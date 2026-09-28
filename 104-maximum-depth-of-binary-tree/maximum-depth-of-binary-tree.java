/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int func(TreeNode tptr){
        if(tptr==null) return 0;
        return 1+Math.max(func(tptr.left),func(tptr.right)) ;
    }

    public int maxDepth(TreeNode root) {
     return func(root);   
    }
}