class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            int i=0 , j =n-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return;
        }

        for(int i =n-1; i>=0; i--){
            if(arr[i] > arr[pivot]){
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        int ii=pivot+1;
        int jj = n-1;
        while(ii<jj){
            int temp = arr[ii];
            arr[ii] = arr[jj];
            arr[jj] = temp;
            ii++;
            jj--;
        }

    }
}