class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int count=j;
        int max=0;
        while(i<j){
            int temp=Math.min(height[i],height[j]);
            if(height[i]>height[j]){
                j--;
            }else {
                i++;
            }
            max=Math.max(temp*count,max);
            count--;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna