public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        int shortestLen = prefix.length();

        for (int k=1; k<strs.length; k++) {
            if (shortestLen < strs[k].length())
                prefix = strs[k];
        }

        for (int i=0; i<strs.length; i++) {
            prefix = compareAndFind(prefix, strs[i]);
        }
        return prefix;
    }

    public String compareAndFind(String prefix, String compareStr) {
        StringBuilder newStr = new StringBuilder();
        for (int j=0; j<prefix.length() && j<compareStr.length(); j++) {
            if (prefix.charAt(j) == compareStr.charAt(j))
                newStr.append(prefix.charAt(j));
            else
                break;
        }
        return newStr.toString();
    }
}
