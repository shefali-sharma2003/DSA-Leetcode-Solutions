class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder ans = new StringBuilder(s);

        while (ans.indexOf(part) != -1) {
            int idx = ans.indexOf(part);
            ans.delete(idx, idx + part.length());
        }

        return ans.toString();
    }
}