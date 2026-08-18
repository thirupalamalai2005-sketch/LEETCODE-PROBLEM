class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0;
        int left=0;
        int[] map=new int[128];
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            map[c]++;
            while(map[c]>1){
                map[s.charAt(left)]--;
                left++;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna