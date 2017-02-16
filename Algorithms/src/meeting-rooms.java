/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {

    public boolean canAttendMeetings(Interval[] intervals) {

        if (intervals.length < 2) return true;

        Arrays.sort(intervals, new Comparator<Interval>() {
           public int compare(Interval v1, Interval v2) {
               return v1.start-v2.start;
           }
        });

        for (int i=0; i<intervals.length-1; i++) {
            if (intervals[i].end > intervals[i+1].start)
                return false;

            if (intervals[i].start == intervals[i+1].start) {
                if (intervals[i].end <= intervals[i+1].end)
                    return false;
            }
            if (intervals[i].end >= intervals[i+1].end)
                return false;
        }
        return true;
    }
}
