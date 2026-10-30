public class PalindromPartioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(new ArrayList<>(), s, result);

        return result;
    }

    public void backtrack(List<String> path, String remainingString,
                          List<List<String>> result) {

        if (remainingString.length() == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 1; i <= remainingString.length(); i++) {
            String choice = remainingString.substring(0, i);

            if (!isPalindrome(choice)) {
                continue;
            }

            path.add(choice);
            backtrack(path, remainingString.substring(i), result);
            path.remove(path.size() - 1);
        }
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
