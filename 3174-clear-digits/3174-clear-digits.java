class Solution {
    public String clearDigits(String s) {
        StringBuilder st=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                num++;
            }else {
                st.append(c);
            }
            int len=st.length();
            while(num>0 && len>0){
                st.deleteCharAt(len-1);
                num--;
                len--;
            }
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna