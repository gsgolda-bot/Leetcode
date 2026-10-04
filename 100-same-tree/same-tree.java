class Solution {

    boolean cmp(TreeNode tptr1, TreeNode tptr2){
        if(tptr1==null && tptr2==null) return true;
        if(tptr1==null || tptr2==null) return false;
        if(tptr1.val!=tptr2.val) return false;
        return cmp(tptr1.left,tptr2.left) && cmp(tptr1.right,tptr2.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return cmp(p,q);
    }
}