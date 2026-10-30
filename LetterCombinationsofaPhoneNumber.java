public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] letters = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();

        backtrack(digits, 0, letters, path, result);

        return result;
    }

    public void backtrack(String digits, int index,
                          String[] letters,
                          StringBuilder path,
                          List<String> result) {

        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String choices = letters[digits.charAt(index) - '0'];

        for (int i = 0; i < choices.length(); i++) {

            path.append(choices.charAt(i));

            backtrack(digits, index + 1,
                    letters, path, result);

            path.deleteCharAt(path.length() - 1);
        }
    }
}
