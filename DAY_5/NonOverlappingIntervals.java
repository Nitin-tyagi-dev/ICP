package DAY_5;
import java.util.Arrays;
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int lastEnd = intervals[0][1];
        int count = 1 ;
        for(int i = 1 ; i < n ; i++){
            if(intervals[i][0] >= lastEnd){
                count++;
                lastEnd = intervals[i][1];
            }
        }

        return n - count;
    }

    public static void main(String[] args) {
        NonOverlappingIntervals obj = new NonOverlappingIntervals();
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(obj.eraseOverlapIntervals(intervals));
    }
}
