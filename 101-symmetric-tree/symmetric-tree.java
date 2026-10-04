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
    boolean cmp(TreeNode tptr1, TreeNode tptr2){
    if(tptr1==null && tptr2==null) return true;
    if(tptr1==null || tptr2==null) return false;
    if(tptr1.val!=tptr2.val) return false;
    return cmp(tptr1.left,tptr2.right) && cmp(tptr1.right,tptr2.left);
}
    public boolean isSymmetric(TreeNode root) {
        return cmp(root.left,root.right);
    }
}