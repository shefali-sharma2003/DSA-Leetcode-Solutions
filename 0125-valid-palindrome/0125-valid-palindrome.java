class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        // Remove special characters and convert to lowercase
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        char[] arr = str.toString().toCharArray();

        int i = 0, j = arr.length - 1;

        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String rev = new String(arr);

        return str.toString().equals(rev);
    }
}