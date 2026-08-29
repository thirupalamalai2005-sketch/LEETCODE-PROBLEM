class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st=new StringBuilder();
        int len=word1.length();
        int len2=word2.length();
        int max=Math.max(len,len2);
        for(int i=0;i<max;i++){
            boolean check1=(i<len);
            boolean check2=(i<len2);
            if(check1){
                st.append(word1.charAt(i));
            }
            if(check2){
                st.append(word2.charAt(i));
            }
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna