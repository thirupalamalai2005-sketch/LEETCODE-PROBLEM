class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int exe[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            exe[i]=heights[i];
        }
        Arrays.sort(exe);
        for(int i=0;i<heights.length;i++){
            if(exe[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna