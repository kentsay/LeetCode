import java.util.HashMap;

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.remove(num);
            } else {
                map.put(num, num);
            }
        }
        int singleNumber = 0;
        for (int key: map.keySet()) {
            singleNumber = key;
        }
        return singleNumber;
    }
}
