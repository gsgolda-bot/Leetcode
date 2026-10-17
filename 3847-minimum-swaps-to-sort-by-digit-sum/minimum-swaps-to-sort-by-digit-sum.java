class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            int s1 = digitSum(a);
            int s2 = digitSum(b);
            if (s1 != s2) return s1 - s2;
            return a - b;
        });
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != arr[i]) {
                int j = map.get(arr[i]);
                map.put(nums[i], j);
                map.put(arr[i], i);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                swaps++;
            }
        }
        return swaps;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}