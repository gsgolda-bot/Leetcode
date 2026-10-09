class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int ans = 0;
        for (int ind = 0; ind < s.length(); ind++) {
            char ch = s.charAt(ind);
            if (ch == '(') {
                open++;
            } else {
                if (ind + 1 < s.length() && s.charAt(ind + 1) == ')') {
                    ind++;
                } else {
                    ans++;
                }
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }
        return ans + 2 * open;
    }
}