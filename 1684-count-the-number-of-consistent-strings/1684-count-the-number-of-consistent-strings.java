class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String m:words){
            boolean check=true;
            for(char k:m.toCharArray()){
                if(allowed.indexOf(k)==-1){
                    check=false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna