public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums, path, result, 0);

        return result;
    }

    public void backtrack(int[] nums, List<Integer> path,
                          List<List<Integer>> result, int start) {

        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            path.add(nums[i]);

            backtrack(nums, path, result, i + 1);

            path.remove(path.size() - 1);
        }
    }
}
