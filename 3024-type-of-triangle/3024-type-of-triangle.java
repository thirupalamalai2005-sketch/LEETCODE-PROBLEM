class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        return (a==b && b==c)?"equilateral":
        (a+b<=c || b+c<=a || a+c<=b)?"none":
        (a==b && a+b>c || b==c && b+c>a || a==c && a+c>b)?"isosceles":"scalene";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna