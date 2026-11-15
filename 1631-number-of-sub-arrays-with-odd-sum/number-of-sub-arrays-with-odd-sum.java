class Solution {
    public int numOfSubarrays(int[] arr) {
        long odd = 0, even = 1;
        long sum = 0, ans = 0;
        int mod = 1000000007;
        for (int num:arr) {
            sum += num;
            if (sum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
            ans %= mod;
        }
        return(int) ans;
    }
}