public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        List<Integer> choices = new ArrayList<>();
        for (int num : nums) {
            choices.add(num);
        }

        backtrack(new ArrayList<>(), choices, result);

        return result;
    }

    public void backtrack(List<Integer> path,
                          List<Integer> choices,
                          List<List<Integer>> result) {

        if (choices.isEmpty()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < choices.size(); i++) {

            if (i > 0 && choices.get(i).equals(choices.get(i - 1))) {
                continue;
            }

            int selected = choices.get(i);
            path.add(selected);

            List<Integer> remaining = new ArrayList<>(choices);
            remaining.remove(i);

            backtrack(path, remaining, result);

            path.remove(path.size() - 1);
        }
    }
}
