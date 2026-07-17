class Solution {
    public int numberOfSpecialChars(String word) {
        int cap[]=new int[26];
        int smal[]=new int[26];
        for(int i=0;i<word.length();i++){
            char temp=word.charAt(i);
            if(temp>64  && temp<91){
                cap[temp-'A']++;
            }else{
                smal[temp-'a']++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(cap[i]>=1 && smal[i]>=1){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna