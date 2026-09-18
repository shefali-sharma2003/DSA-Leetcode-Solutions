class Solution {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int i = 0 , j = nums.length-k-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }

        int a = nums.length-k, b =nums.length-1;
        while(a<b){
            swap(nums,a,b);
            a++;
            b--;
        }

       int ii = 0 , jj = nums.length-1;
        while(ii<jj){
            swap(nums,ii,jj);
            ii++;
            jj--;
        } 
    }
}