class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

        int m = arr.length;
        int n = arr[0].length;

        int start = 0;
        int end = m * n - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            int row = mid / n;
            int col = mid % n;

            if(arr[row][col] == target)
                return true;

            else if(arr[row][col] < target)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return false;
    }
}