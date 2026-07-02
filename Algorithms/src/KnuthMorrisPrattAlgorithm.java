public class KnuthMorrisPrattAlgorithm {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        // Build LPS
        int[] lps = new int[m];

        int i = 1;
        int j = 0;

        while (i < m) {

            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            }
            else {

                if (j == 0) {
                    lps[i] = 0;
                    i++;
                }
                else {
                    j = lps[j - 1];
                }
            }
        }

        // KMP Search
        i = 0;
        j = 0;

        while (i < n) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            else {

                if (j == 0) {
                    i++;
                }
                else {
                    j = lps[j - 1];
                }
            }

            if (j == m) {
                return i - m;
            }
        }

        return -1;
    }

}
