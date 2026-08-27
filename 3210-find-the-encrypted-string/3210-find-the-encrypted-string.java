class Solution {
    public String getEncryptedString(String s, int k) {
        int len=s.length();
        return s.substring(k%len,len)+""+s.substring(0,k%len);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna