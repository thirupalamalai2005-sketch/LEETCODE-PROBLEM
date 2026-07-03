class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String a:patterns){
            if(word.indexOf(a)!=-1){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna