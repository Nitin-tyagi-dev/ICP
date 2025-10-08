package DAY_5;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;

        java.util.Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int lastEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > lastEnd) {
                arrows++;
                lastEnd = points[i][1];
            }
        }

        return arrows;
    }
    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons obj = new MinimumNumberOfArrowsToBurstBalloons();
        int[][] points = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(obj.findMinArrowShots(points)); // Output: 2
    }

}
