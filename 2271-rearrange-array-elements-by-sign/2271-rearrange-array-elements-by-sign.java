class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Brute Force Approach
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                positives.add(nums[i]);
            else
                negatives.add(nums[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            ans[2 * i] = positives.get(i);
            ans[2 * i + 1] = negatives.get(i);
        }
        return ans;
    }
}