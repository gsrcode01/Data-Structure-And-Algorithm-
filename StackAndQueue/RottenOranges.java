package StackAndQueue;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Add all rotten oranges to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int k = 0; k < size; k++) {

                int[] curr = queue.poll();

                int x = curr[0];
                int y = curr[1];

                // Up
                if (x > 0 && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 2;
                    fresh--;
                    queue.offer(new int[]{x - 1, y});
                }

                // Down
                if (x < m - 1 && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 2;
                    fresh--;
                    queue.offer(new int[]{x + 1, y});
                }

                // Left
                if (y > 0 && grid[x][y - 1] == 1) {
                    grid[x][y - 1] = 2;
                    fresh--;
                    queue.offer(new int[]{x, y - 1});
                }

                // Right
                if (y < n - 1 && grid[x][y + 1] == 1) {
                    grid[x][y + 1] = 2;
                    fresh--;
                    queue.offer(new int[]{x, y + 1});
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
