class Solution {

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {

        char[] ch = s.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {

            // i is not a vowel → move i
            if (!isVowel(ch[i])) {
                i++;
            }

            // j is not a vowel → move j
            else if (!isVowel(ch[j])) {
                j--;
            }

            // both are vowels → swap
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }

        return new String(ch);
    }
}