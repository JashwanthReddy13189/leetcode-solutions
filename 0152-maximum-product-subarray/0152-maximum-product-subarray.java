class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        // Two pointer approach
        int l = 1, r = 1;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {

            // if any l or r becomes 0 then update to 1
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;

            l *= nums[i];
            r *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(l, r));
        }
        return ans;
    }
}