class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // store the entire pascal triangle
        for( int row = 1; row <= numRows; row++) {
            result.add(generateRow(row));
        }

        return result;
    }

    static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        // add the first element into ansRow
        ansRow.add(1);

        // Calculate for the remaining elements
        for(int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }

        return ansRow;
    }
}