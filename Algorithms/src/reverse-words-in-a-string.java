public class Solution {
    public String reverseWords(String input) {
        if (input.length() == 0 || input.equals("")) return "";

        String[] strArray = input.split(" ");
        String result = "";

        for (int i = strArray.length -1; i >= 0; i--) {
            if (strArray[i].equals("")) continue;
            else result += strArray[i] + " ";
        }
        if (result == null || result.length() == 0) {
            return result;
        }
        return result.substring(0, result.length() - 1);
    }
}
