class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int len=s.length()-1;
        for(int i=0;i<len;i++){
            sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna