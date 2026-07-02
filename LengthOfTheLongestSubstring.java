public class LengthOfTheLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int maxWS = 0;

        for (j = 0; j < s.length(); j++) {

            if (map.containsKey(s.charAt(j)) &&
                    map.get(s.charAt(j)) >= i) {

                i = map.get(s.charAt(j)) + 1;
            }

            map.put(s.charAt(j), j);

            int currWS = j - i + 1;

            maxWS = Math.max(maxWS, currWS);
        }

        return maxWS;
    }
}
