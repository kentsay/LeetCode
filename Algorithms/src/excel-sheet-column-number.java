public class Solution {
    public int titleToNumber(String s) {
        if (s.length() == 0) return 0;

        int digit = s.length();
        char[] S = s.toCharArray();
        int result = 0;
        for (char c: S) {
            result += (c-'A'+1)*Math.pow(26, digit-1);
            digit--;
        }
        return result;

    }
}
