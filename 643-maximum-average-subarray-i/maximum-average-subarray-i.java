class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
        int st,end,i;
        double sum,avg;
        double max_avg=-Double.MAX_VALUE;
        sum=0;
        for(i=0;i<k;i++)
            sum+=nums[i];
        avg=sum/k;
        if(avg>max_avg) 
            max_avg=avg;      
        st=0;
        end=k-1;
     while(true)
     {   
        end++;
        if(end==nums.length) break;
        sum+=nums[end];
        sum-=nums[st];
        st++;
        avg=sum/k;
        if(avg>max_avg) max_avg=avg;
     }
     return max_avg;
    }
}