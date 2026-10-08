class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(count);
                stringStack.push(current);

                count = 0;
                current = new StringBuilder();
            }

            else if (ch == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeatTimes; i++) {
                    prev.append(current);
                }

                current = prev;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}