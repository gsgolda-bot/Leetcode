class Solution{
void fun(TreeNode tptr,String str,List<String> res)
{
  if(tptr==null) return;
  if(tptr.left==null&&tptr.right==null)  
 {
   str=str+tptr.val;
   res.add(str);
   return;
 }
 str=str+tptr.val+"->";
 fun(tptr.left,str,res);
 fun(tptr.right,str,res);
}
public List<String> binaryTreePaths(TreeNode root) {
     List<String> res=new ArrayList<>();
     fun(root,"",res);
     return res;   
   }
}
