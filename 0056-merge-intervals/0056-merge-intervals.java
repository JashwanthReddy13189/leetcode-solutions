class Solution {
    public int[][] merge(int[][] intervals) {
        // brute force approach
        // first check if intervals are only one return intervals
        if(intervals.length <= 1) return intervals;
        
        // sort the given intervals with given start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int n = intervals.length;

        for( int i=0; i<n; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

             // check if res has already travelled intervals and 
            // skip if current interval is already covered by the last one
            if(!result.isEmpty() && end <= result.getLast()[1]) continue;

            // merge overlapping intervals
            for(int j=i+1; j<n; j++) {
                if(intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }

            result.add(new int[]{start, end});

        }

        return result.toArray(new int[result.size()][]);
    }
}