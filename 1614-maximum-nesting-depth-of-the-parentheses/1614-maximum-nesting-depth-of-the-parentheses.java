class Solution {
    public int maxDepth(String s) {
        int len=s.length();
        int open=0;
        int max=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else if(ch==')'){
                open--;
            }
            if(open>max){
                max=open;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna