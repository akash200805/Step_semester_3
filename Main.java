
public class Main {

    static int busiestRow(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int row = 0;

        for (int i = 0; i < grid.length; i++) {
            int sum = 0;

            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }

            if (sum > max) {
                max = sum;
                row = i;
            }
        }

        return row;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 1, 2}
        };

        System.out.println(busiestRow(grid));
    }
}