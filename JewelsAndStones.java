public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jSet = new HashSet<>();

        // Store all jewels in the Set
        for (int i = 0; i < jewels.length(); i++) {
            jSet.add(jewels.charAt(i));
        }

        int count = 0;

        // Check each stone
        for (int i = 0; i < stones.length(); i++) {
            if (jSet.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
