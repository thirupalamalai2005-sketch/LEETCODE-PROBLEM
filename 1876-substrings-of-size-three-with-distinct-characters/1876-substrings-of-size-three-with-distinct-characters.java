class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int len=s.length()-3;
        int i=0;
        while(i<=len){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            char c=s.charAt(i+2);
            if(a!=b && b!=c && a!=c){
                count++;
            }
            i++;
        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna