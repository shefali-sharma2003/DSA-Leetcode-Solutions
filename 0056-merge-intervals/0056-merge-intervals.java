class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;

        int[][] result = new int[n][2];

        int resultSize = 1;

        result[0] = intervals[0];

        for (int i = 1; i < n; i++) {

            int[] current = result[resultSize - 1];
            int[] interval = intervals[i];

            // Overlapping
            if (interval[0] <= current[1]) {

                current[1] = Math.max(current[1], interval[1]);

            } 
            // Non-overlapping
            else {

                result[resultSize] = interval;
                resultSize++;
            }
        }

        int[][] answer = new int[resultSize][2];

        for (int i = 0; i < resultSize; i++) {
            answer[i] = result[i];
        }

        return answer;
    }
}