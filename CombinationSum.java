public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(candidates, target, path, result, 0);

        return result;
    }

    public void backtrack(int[] candidates, int remainingSum, List<Integer> path, List<List<Integer>> result, int start) {

        if (remainingSum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (remainingSum < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            path.add(candidates[i]);

            backtrack(candidates, remainingSum - candidates[i], path, result, i);

            path.remove(path.size() - 1);
        }
    }
}
