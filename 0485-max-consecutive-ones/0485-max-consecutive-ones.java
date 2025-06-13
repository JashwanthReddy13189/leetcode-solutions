class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, maxCO = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxCO = Math.max(cnt, maxCO);
            } else {
                cnt = 0;
            }
        }
        return maxCO;
    }
}