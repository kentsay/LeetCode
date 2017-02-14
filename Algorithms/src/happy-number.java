public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
		set.add(n);
		while (n != 1) {
			int sum = 0;
			int nn = n;
			while (nn != 0) {
				int d = nn % 10;
				sum += d * d;
				nn /= 10;
			}
			if (set.contains(sum)) {
				return false;
			} else {
				set.add(sum);
				n = sum;
			}
		}
		return n == 1;
    }
}
