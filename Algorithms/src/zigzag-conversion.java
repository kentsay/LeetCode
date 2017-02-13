public class Solution {
    public String convert(String input, int rowNumber) {
        if (rowNumber == 1) return input;
        StringBuilder[] builder = new StringBuilder[rowNumber];
        //init all the StringBuilder array
        for (int i =0; i < rowNumber; i++) {
            builder[i] = new StringBuilder();
        }

        int m = rowNumber * 2 - 2;
        char[] charArr = input.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i % m < rowNumber) {
                builder[i % m].append(input.charAt(i));
            } else {
                builder[m- i % m].append(input.charAt(i));
            }
        }

        String result = "";
        for (StringBuilder sb: builder) {
            result += sb.toString();
        }
        return result;
    }
}
