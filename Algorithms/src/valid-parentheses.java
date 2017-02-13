public class Solution {
    public boolean isValid(String s) {
        if (s.length() %2 != 0) return false;

        ArrayList<Character> open = new ArrayList<>();
        ArrayList<Character> close = new ArrayList<>();
        open.add('(');open.add('[');open.add('{');
        close.add(')');close.add(']');close.add('}');

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (!open.contains(s.charAt(i)) && !close.contains(s.charAt(i))) return false;

            if (open.contains(s.charAt(i)))
                stack.push(s.charAt(i));

            if (close.contains(s.charAt(i))) {
                if (stack.empty()) return false;
                else {
                    if (s.charAt(i) == ')') {
                        if (stack.pop() != '(') return false;
                    }
                    if (s.charAt(i) == ']') {
                        if (stack.pop() != '[') return false;
                    }
                    if (s.charAt(i) == '}') {
                        if (stack.pop() != '{') return false;
                    }
                }
            }
        }
        if (!stack.empty()) return false;
        else
            return true;
    }
}
