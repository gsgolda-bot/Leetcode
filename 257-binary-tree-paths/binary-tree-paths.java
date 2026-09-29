class Solution {
List<String>BTPaths = new ArrayList<>();
    void path(TreeNode tptr,String str){
        if(tptr==null) return;
        if(str.equals("")){
            str=""+tptr.val;
        }
        else{
            str=str+"->"+tptr.val;
        }
        if(tptr.left==null && tptr.right==null){
            BTPaths.add(str);
            return;
        }
        path(tptr.left,str);
        path(tptr.right,str);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        path(root,"");
        return BTPaths;
    }
}