class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int mat[][]=new int[m][n];
        if (original.length!=m*n) {
            return new int[][]{};
        }
        int i=0;
        for(int k=0;k<m;k++){
            for(int j=0;j<n;j++){
                mat[k][j]=original[i++];
            }
        }
        return mat;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna