/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int[] map = new int[1000000];
        for(int a=0;a<intervals.size();a++) {
            for(int b=intervals.get(a).start;b<intervals.get(a).end;b++)
                map[b]++;
        }
        for(int c=0;c<map.length;c++)
            if(map[c]>1)
                return false;
        return true;
    }
}
