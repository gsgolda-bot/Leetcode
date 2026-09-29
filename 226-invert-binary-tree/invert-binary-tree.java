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
    void invert(TreeNode tptr){
        if(tptr==null) return;
        
        TreeNode temp=tptr.left;
        tptr.left=tptr.right;
        tptr.right=temp;

        invert(tptr.left);
        invert(tptr.right);
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}