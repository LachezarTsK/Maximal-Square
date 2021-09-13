package maximalSquare.dp_matrix;

public class SolutionWithMatrix {

    public int maximalSquare(char[][] matrix) {

        int rows = matrix.length + 1;
        int columns = matrix[0].length + 1;
        int[][] dp = new int[rows][columns];
        int maxSquareSide = 0;

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < columns; c++) {
                if (matrix[r - 1][c - 1] == '1') {
                    dp[r][c] = Math.min(Math.min(dp[r - 1][c], dp[r][c - 1]), dp[r - 1][c - 1]) + 1;
                    maxSquareSide = Math.max(maxSquareSide, dp[r][c]);
                }
            }
        }

        return maxSquareSide * maxSquareSide;
    }
}
