
class Solution {
    public int maxProduct(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            boolean[] letters = new boolean[26];

            for (char ch : words[i].toCharArray()) {
                letters[ch - 'a'] = true;
            }

            for (int j = i + 1; j < words.length; j++) {
                boolean common = false;

                for (char ch : words[j].toCharArray()) {
                    if (letters[ch - 'a']) {
                        common = true;
                        break;
                    }
                }

                if (!common) {
                    int product = words[i].length() * words[j].length();
                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }
}
