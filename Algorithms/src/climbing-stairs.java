public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int a = 1; int b = 1; int temp = 0;
        for (int i = 1; i<n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
