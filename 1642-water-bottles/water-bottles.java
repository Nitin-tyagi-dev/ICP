class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0 ;
        ans = numBottles;
        while (numBottles >= numExchange){
            int empty = (numBottles % numExchange);
            ans = ans +  (numBottles / numExchange);
            numBottles = (numBottles / numExchange) + empty;
            empty = 0 ;
        }

        return ans;
    }
}