class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       String res="";
        for(String ar:words){
            int temp=0;
            while(!ar.equals("")){
                temp+=weights[ar.charAt(0)-'a'];
                ar=ar.substring(1);
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