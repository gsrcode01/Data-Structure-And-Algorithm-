public class smallestPalindromicRearrangementI {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        // Count frequency of characters
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = ' ';

        // Build left half in sorted order
        for (int i = 0; i < 26; i++) {

            // Add half of the occurrences
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char)('a' + i));
            }

            // Character with odd frequency goes in middle
            if (freq[i] % 2 == 1) {
                middle = (char)('a' + i);
            }
        }

        // Right half is reverse of left
        String right = new StringBuilder(left)
                .reverse()
                .toString();

        if (middle != ' ') {
            return left.toString() + middle + right;
        }

        return left.toString() + right;
    }
}
