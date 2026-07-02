package StackAndQueue;

public class NextGreatestElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> ngeMap = new HashMap<>();

        int n = nums2.length;

        stack.push(nums2[n - 1]);
        ngeMap.put(nums2[n - 1], -1);

        for (int i = n - 2; i >= 0; i--) {

            int top = stack.peek();

            if (nums2[i] < top) {
                ngeMap.put(nums2[i], top);
            } else {

                while (!stack.isEmpty()) {

                    if (stack.peek() < nums2[i]) {
                        stack.pop();
                    } else {
                        ngeMap.put(nums2[i], stack.peek());
                        break;
                    }
                }

                if (stack.isEmpty()) {
                    ngeMap.put(nums2[i], -1);
                }
            }

            stack.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = ngeMap.get(nums1[i]);
        }

        return ans;
    }
}
