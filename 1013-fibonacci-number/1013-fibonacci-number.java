class Solution {
    public int fib(int n) {
        return Solution.fibonacciCheck(n);
    }

    private static int fibonacciCheck(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonacciCheck(n - 1);
        int sLast = fibonacciCheck(n - 2);
        return last + sLast;
    }
}