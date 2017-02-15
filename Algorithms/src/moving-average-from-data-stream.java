public class MovingAverage {
        private LinkedList list;
        private int size;
        private double sum;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        list = new LinkedList();
        this.size = size;
        this.sum = 0;
    }

    public double next(int val) {
        if (list.size() < size) {
            //still have space in queue
            list.add(val);
            sum = sum+val;
            return sum/list.size();
        } else {
            //queue is full, poll the first
            int first = (int)list.poll();
            list.add(val);
            sum = sum-first;
            sum = sum + val;
            return sum/size;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
