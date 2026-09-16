class Solution {
    public int[] searchRange(int[] nums, int target) {
       int st=0,en=nums.length-1,mid;
       int[] arr=new int[2];
       int ft=-1,lt=-1;
       while(st<=en){  //to find 1st occurence
        mid=(st+en)/2;
        if(nums[mid]==target){
            en=mid-1;
            ft=mid;
        }
        else if(nums[mid]>target) en=mid-1;
        else st=mid+1;
       } 

       st=0;
       en=nums.length-1;
       while(st<=en){  //to find last occurence
        mid=(st+en)/2;
        if(nums[mid]==target){
            st=mid+1;
            lt=mid;
        }
        else if(nums[mid]>target) en=mid-1;
        else st=mid+1;
        }
        arr[0]=ft;
        arr[1]=lt;
        return arr; 
    } 
}