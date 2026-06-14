import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate("", 2 * n, result);

        return result;
    }

    public void generate(String current, int maxLength,
                         List<String> result) {

        if (current.length() == maxLength) {

            if (isValid(current)) {
                result.add(current);
            }
            return;
        }

        generate(current + "(", maxLength, result);
        generate(current + ")", maxLength, result);
    }

    public boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(')
                count++;
            else
                count--;

            if (count < 0)
                return false;
        }

        return count == 0;
    }
}