class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> stack=new Stack<>();
        int i;
        char ch;
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='(' ||ch=='{' || ch=='['){
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty()==true) return false;
                else 
                 {  
                    char pop_ch=stack.pop();
                    if(!(
                    (ch==')' && pop_ch=='(')||
                    (ch==']' && pop_ch=='[')||
                    (ch=='}' && pop_ch=='{')))
                       return false;
                 }
            }
        } 
        if(stack.isEmpty()==false) return false;
        return true;
        }
    }