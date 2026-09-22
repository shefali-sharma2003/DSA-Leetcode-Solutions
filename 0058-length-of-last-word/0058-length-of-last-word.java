class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        // char[] ch = words[words.length-1].toCharArray();
        // return ch.length;
        return words[words.length-1].length();
    }
}