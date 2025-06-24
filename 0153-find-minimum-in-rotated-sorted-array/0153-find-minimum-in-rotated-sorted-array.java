class Solution {
    public int findMin(int[] nums) {

        // using sorting
        /*Arrays.sort(nums);
        return nums[0];*/

        // Using binary search
        int number = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < number) {
                number = nums[i];
            } 
        }

        return number;
    }
}