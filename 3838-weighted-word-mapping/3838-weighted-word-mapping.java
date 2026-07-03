class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       String res="";
        for(String ar:words){
            int temp=0;
            for(int i=0;i<ar.length();i++){
                temp+=weights[ar.charAt(i)-'a'];
            }
            temp='z'-(temp%26);
            res+=(char)temp;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna