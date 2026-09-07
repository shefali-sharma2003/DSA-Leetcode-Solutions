class Solution {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] arr) {

        int n = arr.length;
        int pivot = -1;

        // Step 1: Find pivot
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse whole array
        if(pivot == -1){
            int i = 0, j = n - 1;
            while(i < j){
                swap(arr, i, j);
                i++;
                j--;
            }
            return;
        }

        // Step 3: Swap with next greater element
        for(int i = n - 1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, pivot, i);
                break;
            }
        }

        // Step 4: Reverse suffix
        int i = pivot + 1, j = n - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}