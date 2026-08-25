class Solution {
    public boolean halvesAreAlike(String s) {
        int right=0;
        int left=0;
        int len=s.length();
        String vowel="aeiouAEIOU";
        for(int i=0;i<len;i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                if(i<len/2){
                    left++;
                }else{
                    right++;
                }
            }
        }
        return right==left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna