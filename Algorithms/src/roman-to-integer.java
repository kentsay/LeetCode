public class Solution {
    public int romanToInt(String s) {

        HashMap<String,Integer> dict = new HashMap<String,Integer>();
        dict.put("I",1);
        dict.put("V",5);
        dict.put("X",10);
        dict.put("L",50);
        dict.put("C",100);
        dict.put("D",500);
        dict.put("M",1000);

        int i = 0;
        int sum = 0;

        while(i < s.length()) {
            String curr = s.substring(i, i+1);
            if (i < s.length()-1) {
                String next = s.substring(i+1, i+2);
                if(dict.get(curr) < dict.get(next)) {
                    sum += dict.get(next) - dict.get(curr);
                    i += 2;
                    continue;
                }
            }
            sum += dict.get(curr);
            i++;
        }
        return sum;
    }


}
