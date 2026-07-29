class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        String vowels = "aeiouAEIOU";
        while(start<end){
            while(start < end && vowels.indexOf(word[start]) == -1){
                start++;
            }
            while(start<end && vowels.indexOf(word[end]) == -1){
             end--;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        String ans = new String(word);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna