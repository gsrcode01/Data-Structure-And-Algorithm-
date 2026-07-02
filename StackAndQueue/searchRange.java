package StackAndQueue;

public class searchRange {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        int l = 0;
        int r = nums.length - 1;

        // First Occurrence
        while (l <= r) {

            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                ans[0] = m;
                r = m - 1;
            }
            else if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        l = 0;
        r = nums.length - 1;

        // Last Occurrence
        while (l <= r) {

            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                ans[1] = m;
                l = m + 1;
            }
            else if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return ans;
    }
}
