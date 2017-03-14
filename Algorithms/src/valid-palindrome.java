public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        boolean palindrome = true;
        for (int i=0; i<s.length()/2; i++) {
            int tail = s.length()-i-1;
            if (s.charAt(i) != s.charAt(tail))
                palindrome = false;
        }
        return palindrome;
    }

    // A better solution for checking if the string is palindrome
    public boolean isPalindromeBetter(String s) {
        if (s.length() == 0) return true;

        int i=0, j=s.length()-1;
        char[] chars = s.toCharArray();

        while(i<j) {
            while(i < j && !Character.isLetterOrDigit(chars[i])) i++;
            while(i < j && !Character.isLetterOrDigit(chars[j])) j--;
            if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) return false;
            i++; j--;
        }
        return true;
    }
}
