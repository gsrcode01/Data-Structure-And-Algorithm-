public class CombiantionSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(k, n, path, result, 1);

        return result;
    }

    public void backtrack(int k, int remainingSum,
                          List<Integer> path,
                          List<List<Integer>> result,
                          int start) {

        if (path.size() == k) {
            if (remainingSum == 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {

            path.add(i);

            backtrack(k, remainingSum - i,
                    path, result, i + 1);

            path.remove(path.size() - 1);
        }
    }
}
