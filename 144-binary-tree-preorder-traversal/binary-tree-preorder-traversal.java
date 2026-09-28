class Solution {
    void pre_order(TreeNode tptr,List<Integer>ans){
        if(tptr==null) return;
        ans.add(tptr.val);
        pre_order(tptr.left,ans);
        pre_order(tptr.right,ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        pre_order(root,ans);
        return ans;
    }
}