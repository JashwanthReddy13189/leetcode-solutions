class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        // using two pointers
        int left = 0, right = n - 1;

        // declaring varible to store max area
        int maxArea = 0;

        // find the <width and height
        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}