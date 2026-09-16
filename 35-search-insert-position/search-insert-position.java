class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0,en=nums.length-1,mid;
        while(st<=en){
            mid=(st+en)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) en=mid-1;
            else st=mid+1;
        }
        return st;
    }
}