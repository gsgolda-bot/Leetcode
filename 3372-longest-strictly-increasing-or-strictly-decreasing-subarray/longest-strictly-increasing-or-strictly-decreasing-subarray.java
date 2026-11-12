class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1, dc=1, max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
            inc++;
            dc=1;
            }
            else if(nums[i]<nums[i-1]){
                dc++;
                inc=1;
            }
            else{
                inc=1;
                dc=1;
            }
            max=Math.max(max, Math.max(inc,dc));
        }
        return max;
    }
}