public class LongestPrefixSuffix {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // If the pattern is empty, answer is 0
        if (m == 0) {
            return 0;
        }

        // Create LPS (Longest Prefix Suffix) array
        int[] lps = new int[m];

        int i = 1; // Current character in pattern
        int j = 0; // Length of matching prefix

        // Build the LPS array
        while (i < m) {

            // Characters match
            if (needle.charAt(i) == needle.charAt(j)) {

                j++;
                lps[i] = j;
                i++;

            } else {

                // No prefix matched, so LPS is 0
                if (j == 0) {
                    lps[i] = 0;
                    i++;
                }

                // Try the previous matching prefix
                else {
                    j = lps[j - 1];
                }
            }
        }

        // Start searching the pattern in the text
        i = 0;
        j = 0;

        while (i < n) {

            // Characters match, move both pointers
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            else {

                // No previous match, move text pointer
                if (j == 0) {
                    i++;
                }

                // Use LPS to skip unnecessary comparisons
                else {
                    j = lps[j - 1];
                }
            }

            // Entire pattern found
            if (j == m) {
                return i - m;
            }
        }

        // Pattern not found
        return -1;
    }
}
