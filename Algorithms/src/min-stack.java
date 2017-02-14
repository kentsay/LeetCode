public class MinStack {

    private static class StackNode {
        private int data;
        private StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    Stack<Integer> stack;
    StackNode top;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        StackNode node = new StackNode(x);
        node.next = top;
        top = node;

        if (x <= getMin()) {
            stack.push(x);
        }
    }

    public void pop() {
        if (top.data == getMin()) {
            stack.pop();
        }
        StackNode temp = top.next;
        top = temp;
    }

    public int top() {
        return top.data;
    }

    public int getMin() {
        if (stack.isEmpty())
            return Integer.MAX_VALUE;
        else
            return stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
