class Solution {
    public boolean judgeCircle(String moves) {
        int U=0;
        int D=0;
        int L=0;
        int R=0;
        for(char a:moves.toCharArray()){
            if(a=='U'){
                U++;
            }else if(a=='D'){
                D++;
            }else if(a=='R'){
                R++;
            }else{
                L++;
            }
        }
        return L-R==0 && U-D==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna