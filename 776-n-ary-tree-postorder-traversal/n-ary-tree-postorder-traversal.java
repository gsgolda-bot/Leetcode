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
}
*/
class Solution {
    void func(Node tptr, List<Integer> arr){
        if(tptr==null) return;
        for(int i=0;i<tptr.children.size();i++){
            func(tptr.children.get(i),arr);
        }
        arr.add(tptr.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> arr = new ArrayList<>();
        func(root,arr);
        return arr;        
    }
}