class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k)
                cnt = cnt + 1;
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                cnt += preSumMap.get(rem);
            }
            preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}