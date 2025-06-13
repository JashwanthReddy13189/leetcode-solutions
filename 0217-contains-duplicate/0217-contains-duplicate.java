class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int i : nums) {
            if(!st.add(i)){
                return true;
            }
        }
        return false;
    }
}