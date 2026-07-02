public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum(nums, i, ans);
            }
        }

        return ans;
    }

    public void twoSum(int[] nums, int x, List<List<Integer>> ans) {

        int i = x + 1;
        int j = nums.length - 1;

        while (i < j) {

            int sum = nums[x] + nums[i] + nums[j];

            if (sum > 0) {
                j--;
            }
            else if (sum < 0) {
                i++;
            }
            else {

                ans.add(Arrays.asList(nums[x], nums[i], nums[j]));

                i++;
                j--;

                // Skip duplicate second elements
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }

                // Skip duplicate third elements
                while (i < j && nums[j] == nums[j + 1]) {
                    j--;
                }
            }
        }
    }

}
