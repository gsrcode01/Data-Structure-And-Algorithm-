public class Combination {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(new ArrayList<>(), 1, n, k, result);

        return result;
    }

    public void backtrack(List<Integer> path, int start, int n, int k,
                          List<List<Integer>> result) {

        // If we have k elements, store the combination
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n; i++) {

            // Choose
            path.add(i);

            // Explore
            backtrack(path, i + 1, n, k, result);

            // Undo / Backtrack
            path.remove(path.size() - 1);
        }
    }
}
