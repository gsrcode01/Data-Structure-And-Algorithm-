public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (j < nums.length) {

            // Remove all smaller elements from the back
            while (!q.isEmpty() && nums[j] > q.peekLast()) {
                q.pollLast();
            }

            // Add current element
            q.offerLast(nums[j]);

            // Window size becomes k
            if (j >= k - 1) {

                // Front of deque is the maximum element
                res[idx++] = q.peekFirst();

                // Remove outgoing element if it is the maximum
                if (nums[i] == q.peekFirst()) {
                    q.pollFirst();
                }

                i++;
            }

            j++;
        }

        return res;
    }
}
