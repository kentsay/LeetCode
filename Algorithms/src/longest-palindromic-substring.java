public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 1;
        int maxBegin = 0;
        boolean[][] table = new boolean[1000][1000];

        for (int i=0; i<n; i++) {
            table[i][i] = true;
        }

        for (int i=0; i<n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                maxLength = 2;
                table[i][i+1] = true;
                maxBegin = i;
            }
        }

        for (int len = 3; len <=n; len++) {
            for (int i=0; i<n-len+1; i++) {
                int j = i+len-1;
                if (s.charAt(i) == s.charAt(j) && table[i+1][j-1]) {
                    table[i][j] = true;
                    maxBegin = i;
                    maxLength = len;
                }
            }
        }
        return s.substring(maxBegin, maxBegin+maxLength);
    }
}
