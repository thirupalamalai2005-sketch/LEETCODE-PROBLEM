class Solution {
    public int balancedStringSplit(String s) {
        int Re=0;
        int Le=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='R'){
                Re++;
            }else if(c=='L'){
                Le++;
            }
            if(Re-Le==0){
                Re=0;
                Le=0;
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna