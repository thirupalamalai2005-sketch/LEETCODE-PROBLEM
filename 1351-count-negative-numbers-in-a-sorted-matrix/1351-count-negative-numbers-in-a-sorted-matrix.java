class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int ar[]:grid){
            for(int n:ar){
                if(n<0){
                    count++;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna