public class FindMostFrequentVowelandConsonant {
    public int maxFreqSum(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        // Find maximum frequency of vowel and consonant
        for (char ch : map.keySet()) {

            if ("aeiou".indexOf(ch) != -1) {
                maxVowel = Math.max(maxVowel, map.get(ch));
            } else {
                maxConsonant = Math.max(maxConsonant, map.get(ch));
            }
        }

        return maxVowel + maxConsonant;
    }
}
