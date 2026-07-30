class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        if(len<=8){
            return len;
        }else if(len>8 && len <=16){
            return 8+(len-8)*2;
        }else if(len>16 && len<=24){
            return 24+(len-16)*3;
        }else{
            return 48+(len-24)*4;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna