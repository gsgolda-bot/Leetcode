class Solution {
    public int search(int[] nums, int target) {
        int st=0,en=nums.length-1,mid;

        while(st<=en){
            mid=(st+en)/2;
            if(nums[mid]==target) return mid;
            else if(nums[st]<=nums[mid])//sorted
            {
                if(nums[st]<=target && nums[mid]>=target) en=mid-1;
                else st=mid+1;
            }
            else // right
            {
                if(nums[en]>=target && nums[mid]<=target) st=mid+1;
                else en=mid-1;
            }
        }
        return -1;
    }
}