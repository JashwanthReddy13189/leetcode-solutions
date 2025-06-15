class Solution {
    public int search(int[] nums, int target) {
        //Map<Integer, Integer> map = new HashMap<>();
        //Set<Integer> set = new HashSet<>();
        for( int i=0; i<nums.length; i++) {
            //set.add(nums[i]);
            if(target == nums[i]) return i;
        }
        return -1;
    }
}