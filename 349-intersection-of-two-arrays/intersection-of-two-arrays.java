class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>arr=new HashSet<>();
        for(int x : nums1){
            for(int y : nums2){
                if(x==y){
                    arr.add(x);
                }

            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}