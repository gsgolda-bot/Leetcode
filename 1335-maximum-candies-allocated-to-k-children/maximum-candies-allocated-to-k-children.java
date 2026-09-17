class Solution {
    boolean isValid(int [] arr , long choco , long tot_child)
    {
        int ind;
        long tot_poss=0;
        for(ind=0;tot_poss< tot_child && ind<arr.length;ind++)
        {
            tot_poss=tot_poss+ (arr[ind]/choco);
        }
        return tot_poss>=tot_child;
    }
    public int maximumCandies(int[] candies, long k) {
        long st;
        long end;
        long mid;
        int ind;
        long tot_choco=0;
        long res=0;
        for(ind=0;ind<candies.length;ind++)
        {
            tot_choco+=candies[ind];
        }
        long avg=tot_choco/k;
        if(avg==0) return 0;
        st=1;
        end=avg;
        while(st<=end)
        {
            mid=(st+end)/2;
            if(isValid(candies,mid,k)==true)//valid
            {
                res=mid;
                st=mid+1;
            }
            else
                end=mid-1;
        }
        return (int)res;
    }
}