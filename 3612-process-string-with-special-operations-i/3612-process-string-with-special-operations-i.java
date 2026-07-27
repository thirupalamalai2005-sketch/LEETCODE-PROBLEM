class Solution {
    public String processStr(String s) {
        StringBuilder st=new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                st=st.append(st);
            }else if(ch=='%'){
                st=st.reverse();
            }else if(ch=='*'){
                if(st.length()>0){
                st=st.deleteCharAt(st.length()-1);
                }
            }else{
                st=st.append(ch);
            }
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna