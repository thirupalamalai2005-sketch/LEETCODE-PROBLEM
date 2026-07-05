class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int len=mat.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j || i+j==len-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna