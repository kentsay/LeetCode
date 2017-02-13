public class Solution {
    public int addDigits(int num) {
        if (num < 0) return -1;
        if (num < 10) return num;
        int ret=0;
        while(num != 0) {
            ret = ret + num % 10;
            num = num/10;
        }
        return addDigits(ret);
    }
}
