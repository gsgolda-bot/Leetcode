class Solution {
    public int search(int[] nums, int target) {
        int st=0,en=nums.length-1,mid;

        while(st<=en){
            mid=(st+en)/2;
            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) st=mid+1;
            else en=mid-1;
        }
        return -1;
    }
}