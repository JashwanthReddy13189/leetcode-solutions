class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // Cunting freq of each char
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Integer maxOdd = null, minEven = null;

        // Looping through frequencies
        for (int f : freq) {
            if (f == 0)
                continue;
            if (f % 2 == 1) {
                if (maxOdd == null || f > maxOdd)
                    maxOdd = f;
            } else {
                if (minEven == null || f < minEven)
                    minEven = f;
            }
        }

        // returning difference
        return (maxOdd != null && minEven != null) ? maxOdd - minEven : -1;
    }
}