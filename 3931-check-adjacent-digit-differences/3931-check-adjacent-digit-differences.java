class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int len=s.length()-1;
        for(int i=0;i<len;i++){
            boolean check=s.charAt(i)-s.charAt(i+1)>=-2 && s.charAt(i)-s.charAt(i+1)<=2 ;
            if(!check){
                return check;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna