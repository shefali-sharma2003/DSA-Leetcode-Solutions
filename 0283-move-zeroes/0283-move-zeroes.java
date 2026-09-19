class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++)
            if(arr[i]==0){
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}