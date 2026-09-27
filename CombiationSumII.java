public class CombiationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, path, result, 0);

        return result;
    }

    public void backtrack(int[] candidates, int remainingSum,
                          List<Integer> path,
                          List<List<Integer>> result,
                          int start) {

        if (remainingSum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (remainingSum <= 0) {
            return;
        }

        for (int i = start;
             i < candidates.length && candidates[i] <= remainingSum;
             i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            path.add(candidates[i]);

            backtrack(candidates,
                    remainingSum - candidates[i],
                    path,
                    result,
                    i + 1);

            path.remove(path.size() - 1);
        }
    }
}
