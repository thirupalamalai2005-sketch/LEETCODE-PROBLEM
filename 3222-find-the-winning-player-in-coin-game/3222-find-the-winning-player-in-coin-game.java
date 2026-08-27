class Solution {
    public String winningPlayer(int x, int y) {
        y=(x<y/4)?x:y/4;
        return (y%2==0)?"Bob":"Alice";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna