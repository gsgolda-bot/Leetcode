class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=0,t=0;
        while(t < typed.length()){
            if(n < name.length() && name.charAt(n)==typed.charAt(t)){
                n++;
                t++;
            }
            else if(t>0 && typed.charAt(t)==typed.charAt(t-1)){
                    t++;
                }
            else return false;
            }
            return n == name.length();

        }
}
        