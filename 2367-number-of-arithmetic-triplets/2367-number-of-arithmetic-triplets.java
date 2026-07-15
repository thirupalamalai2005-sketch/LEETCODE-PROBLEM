class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums){
            if(set.contains(num+diff)&&set.contains(num+2*diff)){
                ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna