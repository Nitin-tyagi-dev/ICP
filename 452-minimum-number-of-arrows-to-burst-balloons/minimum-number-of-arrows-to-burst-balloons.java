class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int arrowPos = points[0][1]; 

        for (int i = 1; i < points.length; i++) {
            
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1]; // shoot at the end of this balloon
            }
        }

        return arrows;
    }
}