class Solution {
    int sum=0;
    void sum_func(TreeNode tptr, boolean isLeft){
        if(tptr==null) return;
        if(tptr.left==null && tptr.right==null){
            if(isLeft) sum+=tptr.val;
        return;
        }
        sum_func(tptr.left, true);
        sum_func(tptr.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        sum_func(root,false);
        return sum;
    }
}