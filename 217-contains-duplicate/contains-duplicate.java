class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>unique = new HashSet<>();
        for(int val:nums){
            if(unique.contains(val)){
                return true;
            }
            unique.add(val);
        }
        return false;
    }
}