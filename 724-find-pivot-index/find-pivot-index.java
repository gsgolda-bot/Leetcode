class Solution {
    public int pivotIndex(int[] nums) {
        int [] r1=new int [nums.length];
        int [] r2=new int [nums.length];
        r1[0]=0;
        for(int i=1;i<nums.length;i++){
            r1[i]=nums[i-1]+r1[i-1];
        }
        r2[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            r2[i]=r2[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(r2[i]==r1[i]) return i;
        }
        return -1;

    }
}