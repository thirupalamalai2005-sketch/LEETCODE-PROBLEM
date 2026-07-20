class Solution {
    public char repeatedCharacter(String s) {
        char arr[]=new char[26];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(arr[a-'a']>0){
                return a;
            }
            arr[a-'a']++;
        }
        return 'a';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna