class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        // Optimal Approach
        // fill set with unique numbers
        for (int num : nums) {
            set.add(num);
        }

        // find the longest sequence
        for (int st : set) {
            if (!set.contains(st - 1)) {
                int x = st;
                int cnt = 1;
                while (set.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}