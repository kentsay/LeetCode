public class Solution {
    public void rotate(int[] nums, int k) {
        if (k==0) return;

        int[] rotate = new int[nums.length];
        System.arraycopy(nums, 0, rotate, 0, nums.length);
        for (int i=0; i<nums.length; i++) {
            nums[(i+k) % nums.length] = rotate[i];
        }
    }
}
