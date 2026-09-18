import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int st=0,en=n;
        while (st<=en) {
            int mid=st+(en-st)/2;
            if (mid<n&&nums[mid]==mid) {
                st=mid+1;
            } else {
                en=mid-1;
            }
        }
        return st;
    }
}