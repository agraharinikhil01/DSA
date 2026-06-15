class Solution {
    public int compress(char[] chars) {

        String result = "";
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i < chars.length - 1 &&
                chars[i] == chars[i + 1]) {

                count++;
            } else {

                result += chars[i];

                if (count > 1) {
                    result += count;
                }

                count = 1;
            }
        }

        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    }
}