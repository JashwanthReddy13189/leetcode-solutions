class Solution {
    public int[][] merge(int[][] intervals) {
        // optimal approach
        
        // sort the given intervals with given start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int n = intervals.length;

        for( int i=0; i<n; i++) {

            // check if current interval does not
            // lie in result list
            if(result.isEmpty() || intervals[i][0] > result.getLast()[1] ) {
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            } 
            // check if current interval
            // lies in result list
            else {
                result.getLast()[1] = Math.max(intervals[i][1], result.getLast()[1]);
            }

        }

        return result.toArray(new int[result.size()][]);
    }
}