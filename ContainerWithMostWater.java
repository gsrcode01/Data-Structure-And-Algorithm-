public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;

        int maxWater = 0;

        // Keep checking until both pointers meet
        while (i < j) {

            // Water stored depends on the shorter height
            int area = Math.min(height[i], height[j]) * (j - i);

            // Update maximum area
            maxWater = Math.max(maxWater, area);

            // Move the pointer with the smaller height
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxWater;
    }
}
