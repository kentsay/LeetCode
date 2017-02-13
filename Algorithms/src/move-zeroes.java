public class Solution {
    public void moveZeroes(int[] nums) {
        int next = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                if (i != next) {
                    nums[next] = nums[i];
                    nums[i] = 0;
                    next++;
                } else {
                    next++;
                }
            }
        }
    }
}
