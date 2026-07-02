public class TrappingRainWater {
    public int trap(int[] height) {

        int n = height.length;

        // maxL[i] = tallest bar from left up to i
        int[] maxL = new int[n];

        // maxR[i] = tallest bar from right up to i
        int[] maxR = new int[n];

        // Build Left Max array
        maxL[0] = height[0];

        for (int i = 1; i < n; i++) {
            maxL[i] = Math.max(maxL[i - 1], height[i]);
        }

        // Build Right Max array
        maxR[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxR[i] = Math.max(maxR[i + 1], height[i]);
        }

        int ans = 0;

        // Calculate trapped water at every index
        for (int i = 0; i < n; i++) {

            int waterTrapped = Math.min(maxL[i], maxR[i]) - height[i];

            ans += waterTrapped;
        }

        return ans;
    }
}
