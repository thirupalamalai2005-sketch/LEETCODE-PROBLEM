class Solution {
    public int[] findDegrees(int[][] matrix) {
        int len=matrix.length;
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            int max=0;
            for(int j=0;j<len;j++){
               max+=matrix[i][j];
            }
            arr[i]=max;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna