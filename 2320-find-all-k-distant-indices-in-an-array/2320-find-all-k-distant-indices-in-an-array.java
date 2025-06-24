class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> indices = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                indices.add(i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < indices.size(); j++) {
                int diff = i - indices.get(j);
                if (Math.abs(diff) <= k) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}