class Solution {
    public int maxArea(int[] height) {
        int l=0,r=(height.length)-1;
        int val,max=0;
        while(l<r){
            if(height[l]<height[r]){
                val=(r-l)*height[l];
                if(val>max) max=val;
                l++;
            }
            else{
                val=(r-l)*height[r];
                if(val>max) max=val;
                r--;
            }
        }
        return max;
    }
}