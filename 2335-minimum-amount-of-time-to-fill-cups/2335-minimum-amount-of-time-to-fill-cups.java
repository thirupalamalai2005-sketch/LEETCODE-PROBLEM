class Solution {
    public int fillCups(int[] amount) {
        int sum = amount[0] + amount[1] + amount[2];
        int maxVal = Math.max(amount[0], Math.max(amount[1], amount[2]));
        return Math.max(maxVal, (sum + 1) / 2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna