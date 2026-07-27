class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        int len=columnTitle.length();
        for(int i=0;i<len;i++){
            result=result*26+(columnTitle.charAt(i)-'A'+1);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna