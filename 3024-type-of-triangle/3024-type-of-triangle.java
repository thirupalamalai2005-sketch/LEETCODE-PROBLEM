class Solution {
    public String triangleType(int[] nums) {
        return (nums[0]==nums[1] && nums[1]==nums[2])?"equilateral":
        (nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1])?"none":
        (nums[0]==nums[1] && nums[0]+nums[1]>nums[2] || nums[1]==nums[2] && nums[1]+nums[2]>nums[0] || nums[0]==nums[2] && nums[0]+nums[2]>nums[1])?"isosceles":"scalene";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna