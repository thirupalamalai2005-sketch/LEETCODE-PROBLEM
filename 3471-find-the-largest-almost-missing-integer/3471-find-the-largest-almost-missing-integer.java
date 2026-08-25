class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51]; 
        for (int start = 0; start <= n - k; start++) {
            boolean[] seen = new boolean[51];
            for (int j = start; j < start + k; j++) {
                if (!seen[nums[j]]) {
                    count[nums[j]]++;
                    seen[nums[j]] = true;
                }
            }
        }
        int result = -1;
        for (int x = 0; x <= 50; x++) {
            if (count[x] == 1) {
                result = Math.max(result, x);
            }
        }

        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna