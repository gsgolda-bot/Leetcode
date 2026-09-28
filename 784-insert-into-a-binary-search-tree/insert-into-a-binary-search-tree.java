class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        TreeNode tptr=root;
        while(true){
            if(val<tptr.val){
                if(tptr.left!=null){
                    tptr=tptr.left;
                }
                else{
                    tptr.left=new TreeNode(val);
                    break;
                }
            }
            else{
                if(tptr.right!=null){
                    tptr=tptr.right;
                }
                else{
                    tptr.right=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}