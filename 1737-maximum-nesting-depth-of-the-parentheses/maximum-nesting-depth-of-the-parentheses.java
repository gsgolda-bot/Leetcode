class Solution {
    public int maxDepth(String s) {
        int dpt=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){ 
                dpt++;
                if(dpt>max) max=dpt;
            }
            
            if(s.charAt(i)==')') dpt--;
        }
        return max;
    }
}