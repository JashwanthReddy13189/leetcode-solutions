class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Optimal Approach
        // Using two pointers and two variables
        int n = nums.length;

        // Sorting the array 
        Arrays.sort(nums);

        // final result set of quads
        List<List<Integer>> res = new ArrayList<>();

        // finding the quads which sum is equal to target
        for (int i = 0; i < n; i++) {
            // Avoiding duplicates while moving i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                // Avoiding duplicates while moving j
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                // k starts after j pointer runs to right side of the array
                int k = j + 1;
                // k starts at end of array to left side of array
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        res.add(quad);
                        k++;
                        l--;
                        // Avoiding duplicates while moving k
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        // Avoiding duplicates while moving l
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    } else if (sum < target)
                        // moving k if sum is less that target
                        k++;
                    else
                        // moving l if sum is greater that target
                        l--;
                }
            }
        }
        return res;
    }
}