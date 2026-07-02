package StackAndQueue;

public class twoSumII {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int findValue = target - nums[i];

            if (hashMap.containsKey(findValue)
                    && hashMap.get(findValue) != i) {

                return new int[]{i, hashMap.get(findValue)};
            }
        }

        return new int[]{-1, -1};
    }
}
