class NumArray {

int[] pre_sum;
    public NumArray(int[] nums) {
        pre_sum= new int [nums.length];
        pre_sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre_sum[i]=nums[i]+pre_sum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return pre_sum[right];
        return pre_sum[right]-pre_sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */