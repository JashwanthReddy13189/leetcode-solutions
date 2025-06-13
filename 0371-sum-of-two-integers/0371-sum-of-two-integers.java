class Solution {
    public int getSum(int a, int b) {
        //return Math.addExact(a,b);
        return b==0 ? a : getSum(a^b, (a&b)<<1);
    }
}