class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";

        for (String word : dictionary) {
            int i = 0, j = 0;
            int n = s.length(), m = word.length();

            while (i < n && j < m) {
                if (s.charAt(i) == word.charAt(j))
                    j++;
                i++;
            }

            if (j == m && (m > ans.length() ||
                    (m == ans.length() && word.compareTo(ans) < 0))) {
                ans = word;
            }
        }

        return ans;
    }
}