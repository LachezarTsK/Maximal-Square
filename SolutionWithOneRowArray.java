public class SolutionWithOneRowArray {

    public int maximalSquare(char[][] matrix) {

        int rows = matrix.length + 1;
        int columns = matrix[0].length + 1;
        int[] dp = new int[columns];
        int upLeft = 0;
        int maxSquareSide = 0;

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < columns; c++) {

                if (matrix[r - 1][c - 1] == '1') {
                    int temp = dp[c];
                    dp[c] = Math.min(Math.min(dp[c - 1], dp[c]), upLeft) + 1;
                    maxSquareSide = Math.max(maxSquareSide, dp[c]);
                    upLeft = temp;
                } else {
                    dp[c] = 0;
                }
            }
        }
        return maxSquareSide * maxSquareSide;
    }
}
