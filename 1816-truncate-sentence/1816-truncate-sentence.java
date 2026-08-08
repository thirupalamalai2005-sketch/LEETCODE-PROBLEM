class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder st=new StringBuilder();
        String arr[]=s.split(" ");
        for(int i=0;i<k;i++){
            st.append(arr[i]);
            if(i+1!=k){
                st.append(" ");
            }
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna