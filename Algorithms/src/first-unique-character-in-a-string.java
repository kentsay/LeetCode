public class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) return -1;
        if (s.length() == 1) return 0;

        HashMap<Character, Integer> countMap = new HashMap<>();
        HashMap<Character, Integer> indexMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
             if(countMap.containsKey(s.charAt(i))){
                countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
            } else {
                indexMap.put(s.charAt(i), i);
                countMap.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(countMap.get(s.charAt(i)) == 1) return indexMap.get(s.charAt(i));
        }
        return -1;
    }
}
