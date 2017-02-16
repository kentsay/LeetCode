public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            if (i == digits.length-1)
                digits[i] = digits[i] + (1 + carry);
            else
                digits[i] += carry;
            if (digits[i] >= 10) {
                carry = digits[i]/10;
                digits[i] -= 10;
            } else carry = 0;
        }
        if (carry == 1) {
            int[] result = new int[digits.length+1];
            result[0] = carry;
            for (int i =0; i< digits.length; i++) {
                result[i+1] = digits[i];
            }
            return result;
        } else
            return digits;
    }
}
