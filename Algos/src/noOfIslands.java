public class noOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        if (rows == 0)
            return 0;
        int cols = grid[0].length;
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    mark(grid, i, j, rows, cols);
                    ans += 1;
                }
            }
        }
        return ans;
    }

    private static void mark(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != '1') {
            return;
        }
        grid[i][j]='2';
        mark(grid, i - 1, j, rows, cols);
        mark(grid, i + 1, j, rows, cols);
        mark(grid, i, j - 1, rows, cols);
        mark(grid, i, j + 1, rows, cols);
    }
}
