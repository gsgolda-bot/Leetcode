class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] pre = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = pre[j + 1] - pre[i];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}