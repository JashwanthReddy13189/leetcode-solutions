class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        
        // first n-k elements 
        reverse(nums, 0, n-k-1);

        // last k elements 
        reverse(nums, n-k, n-1);

        // reverse whole array
        reverse(nums, 0, n-1);

    }
    void reverse(int[] nums, int start, int end) {
        while(start<=end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}