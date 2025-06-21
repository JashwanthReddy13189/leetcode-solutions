class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Optimal Approach
        long ans = 1;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        /*if(rowIndex == 0) {
            return res;
        }*/
        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex + 1 - i);
            ans = ans / i;
            res.add((int)ans);
        }
        return res;
    }
}