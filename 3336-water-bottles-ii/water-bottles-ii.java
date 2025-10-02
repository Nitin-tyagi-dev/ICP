class Solution {
    public int maxBottlesDrunk(int bottles, int exchange) {
        int drunk = bottles;
        int empty = bottles;
        while(empty >= exchange){
            
            empty = (empty - exchange) + 1 ;
            exchange += 1 ;
            drunk += 1;

        }

        return drunk;
    }
}