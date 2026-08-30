class Solution {
    public boolean judgeCircle(String moves) {
        int arr[]=new int[26];
        for(char ch:moves.toCharArray()){
            arr[ch-'A']++;
        }
        return arr['U'-'A']==arr['D'-'A'] && arr['R'-'A']==arr['L'-'A'];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna