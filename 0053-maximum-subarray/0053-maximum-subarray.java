class Solution {
    public int maxSubArray(int[] nums) {
        // Optimal Approach
        int n = nums.length, max = Integer.MIN_VALUE, sum = 0;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i < n; i++) {
            if (sum < 0)
                sum = 0;
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}