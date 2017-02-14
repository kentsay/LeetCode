public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] data = str.split(" ");
        if (pattern.length() != data.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i=0; i<data.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(data[i]))
                    return false;
            } else {
                map.put(pattern.charAt(i), data[i]);

            }
            if (map2.containsKey(data[i])) {
                if (map2.get(data[i]) != pattern.charAt(i))
                    return false;
            } else {
                map2.put(data[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
