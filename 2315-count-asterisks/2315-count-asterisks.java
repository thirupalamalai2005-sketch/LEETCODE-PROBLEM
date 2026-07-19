class Solution {
    public int countAsterisks(String s) {
        int count =0;
        boolean check=false;
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='|'){
                check=!check;
            }else if(ch=='*'&&!check){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna