public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = 0, n = 0;
        int totalSize = nums1.length + nums2.length;

        int[] merged = new int[totalSize];
        int i = 0;

        while (m < nums1.length && n < nums2.length) {

            if (nums1[m] < nums2[n]) {
                merged[i] = nums1[m];
                m++;
            } else {
                merged[i] = nums2[n];
                n++;
            }

            i++;
        }

        while (m < nums1.length) {
            merged[i] = nums1[m];
            m++;
            i++;
        }

        while (n < nums2.length) {
            merged[i] = nums2[n];
            n++;
            i++;
        }

        int len = merged.length;

        if (len % 2 == 1) {
            return merged[len / 2];
        } else {
            return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
        }
    }
}
