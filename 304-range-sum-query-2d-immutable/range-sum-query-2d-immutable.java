class NumMatrix {
    int[][] sum;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        sum = new int[rows + 1][cols + 1];

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                sum[r][c] = matrix[r - 1][c - 1]
                          + sum[r - 1][c]
                          + sum[r][c - 1]
                          - sum[r - 1][c - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1]
             - sum[row1][col2 + 1]
             - sum[row2 + 1][col1]
             + sum[row1][col1];
    }
}