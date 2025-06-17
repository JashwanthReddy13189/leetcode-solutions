class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Brute Force Approach
        // Using Sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num) && !set2.contains(num)) {
                result.add(num);
                set2.add(num);
            }
        }
        int[] res = new int[result.size()];
        for(int i=0;i<res.length;i++) res[i]=result.get(i);
        return res;
        //return resultSet.stream().mapToInt(Integer::intValue).toArray();

        // Using two pointers
        /*Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Found intersection, add to result if not already added
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();*/
    }
}