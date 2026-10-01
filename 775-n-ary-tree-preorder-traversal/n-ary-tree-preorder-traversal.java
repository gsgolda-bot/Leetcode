/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    void func(Node tptr,List<Integer> arr){
        if(tptr==null) return;
        arr.add(tptr.val);
        for(int ind=0;ind<tptr.children.size();ind++){
            func(tptr.children.get(ind),arr);
        }
    }

    public List<Integer> preorder(Node root) {
         List<Integer> arr= new ArrayList<>();
         func(root,arr);
         return arr;     
    }
}