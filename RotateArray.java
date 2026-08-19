public class RotateArray {
    //My Solution but time limit get exceeded
//    class Solution {
//        public void rotate(int[] nums, int k) {
//
//            k = k % nums.length;
//
//            while (k > 0) {
//
//                int temp = nums[nums.length - 1];
//
//                for (int i = nums.length - 1; i > 0; i--) {
//                    nums[i] = nums[i - 1];
//                }
//
//                nums[0] = temp;
//
//                k--;
//            }
//        }
//    }
    //optimal Approach
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);  // Reverse everything
        reverse(nums, 0, k - 1);  // Fix first k elements
        reverse(nums, k, n - 1);  // Fix remaining elements
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }


}
