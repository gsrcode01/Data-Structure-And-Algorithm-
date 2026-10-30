public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First and last element of every row is 1
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Sum of two elements from previous row
                    int value = ans.get(i - 1).get(j - 1)
                            + ans.get(i - 1).get(j);

                    row.add(value);
                }
            }

            ans.add(row);
        }

        return ans;
    }
}
