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
    void post_order(TreeNode tptr,List<Integer>ans){
        if(tptr==null) return;
        post_order(tptr.left,ans);
        post_order(tptr.right,ans);
        ans.add(tptr.val);
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post_order(root,ans);
        return ans;
    }
}