class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = 0;
        int leftIndex = m, rightIndex = 0;
        while(left >=0 && right <n) {
            if(nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        // adding nums2[] value into nums1[]
        while( rightIndex < n) {
            nums1[leftIndex] = nums2[rightIndex];
            leftIndex++;
            rightIndex++;
        }
        Arrays.sort(nums1);
    }
}