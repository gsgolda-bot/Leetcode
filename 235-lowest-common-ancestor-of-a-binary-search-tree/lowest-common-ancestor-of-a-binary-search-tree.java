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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode tptr=root;
        while(tptr!=null){
            if(p.val<tptr.val && q.val<tptr.val) tptr=tptr.left;
            else if(p.val>tptr.val && q.val>tptr.val) tptr=tptr.right;
            else break;
        }
        return tptr;
    }
}