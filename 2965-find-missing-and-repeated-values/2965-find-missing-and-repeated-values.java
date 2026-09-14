class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int missing = -1, repeat = -1;

        Map<Integer, Integer> freq = new HashMap<>();
        for(int[] row : grid){
            for(int num : row){
                freq.put(num, freq.getOrDefault(num,0)+1);
            }
        } 
        for(int i=1; i<=n*n; i++){
            if(!freq.containsKey(i)) missing = i;
            else if(freq.get(i)==2) repeat = i;
        }
        return new int[] {repeat,missing};
    }
}