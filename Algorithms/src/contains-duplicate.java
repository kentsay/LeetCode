public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //sort -> O(nlogn)
        //hashmap -> O(n)
        if (nums.length == 0) return false;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n: nums) {
            if (map.containsKey(n)) return true;
            else map.put(n,n);
        }
        return false;
    }
}
