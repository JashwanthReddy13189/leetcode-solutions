class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            if (mpp.containsKey(nums[i])) {
                mpp.put(nums[i], cnt + 1);
            } else {
                mpp.put(nums[i], cnt);
            }
        }
        for (Map.Entry<Integer, Integer> mp : mpp.entrySet()) {
            if (mp.getValue() == 1) {
                return mp.getKey();
            }
        }
        return 0;
    }
}