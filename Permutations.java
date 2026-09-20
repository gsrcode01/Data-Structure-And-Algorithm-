public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(nums, path, result);

        return result;
    }

    public void backtrack(int[] nums, List<Integer> path,
                          List<List<Integer>> result) {

        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!path.contains(nums[i])) {
                path.add(nums[i]);

                backtrack(nums, path, result);

                path.remove(path.size() - 1);
            }
        }
    }
}
