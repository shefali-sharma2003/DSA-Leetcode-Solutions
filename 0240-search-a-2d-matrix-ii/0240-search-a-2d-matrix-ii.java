class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < m; i++) {

            if(target > arr[i][n - 1])
                continue;

            int start = 0;
            int end = n - 1;

            while(start <= end) {

                int mid = start + (end - start) / 2;

                if(arr[i][mid] == target)
                    return true;

                else if(target < arr[i][mid])
                    end = mid - 1;

                else
                    start = mid + 1;
            }
        }

        return false;
    }
}