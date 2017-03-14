public class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) return 0;
        String[] segments = s.split("\\s+");
        int size = 0;
        for (String seg: segments) {
            if (!seg.equals(""))
                size++;
        }
        return size;
    }
}
