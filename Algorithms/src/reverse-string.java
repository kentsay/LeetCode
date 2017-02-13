public class Solution {
    public String reverseString(String s) {
        if (s.equals("")) return "";
        char[] charArr = s.toCharArray();
        for(int i=0; i<charArr.length/2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length-1-i];
            charArr[charArr.length-1-i] = temp;
        }
        return new String(charArr);
    }
}
