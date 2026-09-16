class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=1,en=arr.length-2,mid;
        while(st<=en){
            mid=(st+en)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid-1]) en=mid-1;
            else st=mid+1;
        }
        return -1;
    }
}