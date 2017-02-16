public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for (int n: map.keySet()) {
            int freq = map.get(n);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(n);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i=bucket.length-1; i>0 && k>0; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
                k -= bucket[i].size();
            }
        }
        return result;
    }
}
