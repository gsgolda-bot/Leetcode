class Solution {
    void path(TreeNode tptr,String str,List<String> BTPaths){
        if(tptr==null) return;
        if(tptr.left==null && tptr.right==null){
            str=str+tptr.val;
            BTPaths.add(str);
            return;
        }
        str=str+tptr.val+"->";
        path(tptr.left,str,BTPaths);
        path(tptr.right,str,BTPaths);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>BTPaths = new ArrayList<>();
        path(root,"",BTPaths);
        return BTPaths;
    }
}