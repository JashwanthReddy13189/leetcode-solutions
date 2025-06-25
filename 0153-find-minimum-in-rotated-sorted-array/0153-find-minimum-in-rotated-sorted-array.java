class Solution {
    public int findMin(int[] nums) {


        int low = 0,high = nums.length-1;
        int mid = 0;

        while(low<high){
            mid = low + (high-low)/2;
            if(nums[mid] >= nums[high]){ // right part
                low = mid+1;
            }else {                     // left part 
                high = mid;
            }
        }


        return nums[low];
    }
}