import java.util.ArrayList;
import java.util.Arrays;
public class combinationSum_II {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            curr.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, curr, result); 
            curr.remove(curr.size() - 1); 
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        combinationSum_II solution = new combinationSum_II();
        ArrayList<ArrayList<Integer>> result = solution.combinationSum2(candidates, target);
        System.out.println(result);
    }
}
