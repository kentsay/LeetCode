public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length== 0) return 0;
        int right = nums.length-1;
        int left = 0;
        while(left <= right) {
            if (nums[left] != val) {
                left ++;
                continue;
            } else if (nums[right] == val) {
                right --;
                continue;
            } else {
                nums[left] = nums[right]; //swap
                nums[right] = val;
            }
        }
        return left;

    }
}
