class Solution {
    public int maxProduct(String[] words) {
        int[] arr = new int[words.length];
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int a = 0;
            for(int j=0;j<str.length();j++){
                int val = str.charAt(j)-'a';
                a|=(1<<val);
            }
            arr[i]=a;
        }
        int ans=0;;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]&arr[j])==0){
                    ans=Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
}