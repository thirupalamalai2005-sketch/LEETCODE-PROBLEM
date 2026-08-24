class Solution {
    public int prefixCount(String[] words, String pref) {
        int res=0;
        for(String a:words){
            if(a.startsWith(pref)){
                res++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna