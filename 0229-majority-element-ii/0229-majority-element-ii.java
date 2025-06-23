class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int n = nums.length;

        // loop throuh the array to find elements 
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && nums[i] != ele2) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != ele1) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i])
                cnt1++;
            else if (ele2 == nums[i])
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == ele1)
                cnt1++;
            if (num == ele2)
                cnt2++;
        }
        int min = (n / 3) + 1;
        if (cnt1 >= min)
            res.add(ele1);
        if (cnt2 >= min)
            res.add(ele2);
        return res;
    }
}