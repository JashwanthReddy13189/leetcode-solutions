class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        //int[] indices = new int[2];      
        while(start<=end) { 
            if(numbers[start] + numbers[end] == target) {
                return new int[]{start+1, end+1};
            }
            if(numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}