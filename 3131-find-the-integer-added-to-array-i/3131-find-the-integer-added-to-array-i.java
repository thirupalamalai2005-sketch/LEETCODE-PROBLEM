class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int len=nums1.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums2[i]-nums1[i];
        }
        return sum/len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna